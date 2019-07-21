package org.multithreading.semaphore;

public class Odd implements Runnable {
    private SharePrinter sharePrinter;
    private int max;

    public Odd(SharePrinter sharePrinter, int max) {
        this.sharePrinter = sharePrinter;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max; i+=2) {
            sharePrinter.printOdd(i);
        }
    }
}
