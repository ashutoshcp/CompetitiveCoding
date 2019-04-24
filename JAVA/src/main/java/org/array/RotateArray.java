package org.array;

import org.genericmaths.GCD;

/**
 * Concept: https://www.geeksforgeeks.org/array-rotation/
 */
public class RotateArray {

    private RotateArray() {
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println("Before: ");
        int rotationFactor = 2;
        int length = array.length;
        ArrayPrinter.printArray(array, length);
        rotateArray.leftRotate(array, rotationFactor, length);
        System.out.println("After: ");
        ArrayPrinter.printArray(array, length);
        rotateArray.lefRotateWithReverse(array, rotationFactor, length);
        ArrayPrinter.printArray(array, length);
    }


    /**
     * Left Rotate Function
     * https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
     *
     * @param array
     * @param rotationFactor
     * @param length
     */
    private void lefRotateWithReverse(int[] array, int rotationFactor, int length) {
        rotationFactor = getRotationFactorWithinLength(rotationFactor, length);
        reverseArray(array, 0,rotationFactor-1);
        reverseArray(array, rotationFactor, length-1);
        reverseArray(array, 0,length-1);
    }

    private void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int t = array[start];
            array[start] = array[end];
            array[end] = t;
            start++;
            end--;
        }
    }

    /**
     * Left Rotate: O(n) | O(1)
     * https://www.geeksforgeeks.org/array-rotation/ => Method 3.
     *
     * @param array
     * @param rotationFactor
     * @param length
     */
    private void leftRotate(int[] array, int rotationFactor, int length) {
        assert array.length == length;
        rotationFactor = getRotationFactorWithinLength(rotationFactor, length);
        int j, k, temp;
        int gcd = GCD.gcd(length, rotationFactor);
        System.out.println("gcd: " + gcd);
        for (int i = 0; i < gcd; i++) {
            temp = array[i];
            j = i;
            while (true) {
                k = j + rotationFactor;
                if (k>=length) {
                    k -= length;
                }
                if (k == i) {
                    break;
                }
                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }
    }

    private int getRotationFactorWithinLength(int rotationFactor, int length) {
        if (rotationFactor > length) {
            rotationFactor = rotationFactor%length;
        }
        return rotationFactor;
    }
}
