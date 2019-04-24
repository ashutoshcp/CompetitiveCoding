package org.array;

public class ArrayPrinter {
    static void printArray(int[] Arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    static void printArray(long[] Arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

}
