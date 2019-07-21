package org.multithreading.waitNotify;

public class Printer {
    private volatile boolean isOdd = true;
    public void printEven(int number) {
        synchronized (this) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + number);
            isOdd = !isOdd;
            notify();
        }
    }

    public synchronized void printOdd(int number) {
        synchronized (this) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + number);
            isOdd = !isOdd;
            notify();
        }
    }
}
