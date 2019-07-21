package org.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SharePrinter {

    private Semaphore semaphoreEven = new Semaphore(0);
    private Semaphore semaphoreOdd = new Semaphore(1);
    
    public void printOdd(int num) {
        try {
            semaphoreOdd.acquire();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + ": " + num);
        semaphoreEven.release();
    }

    public void printEven(int num) {
        try {
            semaphoreEven.acquire();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + ": " + num);
        semaphoreOdd.release();
    }
}
