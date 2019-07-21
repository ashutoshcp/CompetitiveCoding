package org.multithreading.semaphore;

public class Even implements Runnable {
    private SharePrinter sharePrinter;
    private int max;

    public Even(SharePrinter sharePrinter, int max) {
        this.sharePrinter = sharePrinter;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i+=2) {
            sharePrinter.printEven(i);
        }
    }
}
