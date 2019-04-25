package org.array;

/**
 * https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
 */
public class CyclicRotateByOne {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Before: ");
        int rotationFactor = 1;
        int length = array.length;
        ArrayPrinter.printArray(array, length);
        rotateArray.lefRotateWithReverse(array, rotationFactor, length);
        System.out.println("After: ");
        ArrayPrinter.printArray(array, length);
    }
}
