package org.multithreading.semaphore;

public class MainOddEven {
    public static void main(String[] args) {
        SharePrinter sharePrinter = new SharePrinter();
        Thread odd = new Thread(new Odd(sharePrinter, 10), "Odd");
        Thread even = new Thread(new Even(sharePrinter, 10), "Even");
        odd.start();
        even.start();
    }
}
