package org.multithreading.waitNotify;

public class WaitNotify {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(new TaskEvenOdd(10, printer, false), "Odd");
        Thread thread2 = new Thread(new TaskEvenOdd(10, printer, true), "Even");
        thread1.start();
        thread2.start();
    }

}
