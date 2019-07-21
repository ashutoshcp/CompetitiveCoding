package org.multithreading.waitNotify;

public class TaskEvenOdd implements Runnable {
    private int max;
    private Printer printer;
    private boolean isEvenNumber;

    public TaskEvenOdd(int max, Printer printer, boolean isEvenNumber) {
        this.max = max;
        this.printer = printer;
        this.isEvenNumber = isEvenNumber;
    }


    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                printer.printEven(number);
            } else {
                printer.printOdd(number);
            }
            number += 2;
        }
    }
}
