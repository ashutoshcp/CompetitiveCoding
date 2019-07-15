package org.array;

public class MaximumSubArraySum {

    public MaximumSubArraySum() {
    }

    public static void main(String[] args) {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        int[] array = {-2, -3, -4, -1, 0, -5};
        int n = array.length;
        maximumSubArraySum.maximumSumSubArray(array, n);
    }

    private void maximumSumSubArray(int[] arr, int size) {
        int start = 0, end = 0, maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0, currentStart = 0;
        int maxNeg = arr[0], index = 0;
        boolean allNegative = true;
        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + arr[i];

            if (arr[i] >= 0) {
                allNegative = false;
            } else {
                if (arr[i] > maxNeg) {
                    maxNeg = arr[i];
                    index = i;
                }
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                currentStart = i + 1;
            } else if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = currentStart;
                end = i;
            }
        }
        if (!allNegative) {
            System.out.println("Maximum contiguous sum:  " + maxSoFar);
            System.out.println("Starting Index: " + start + " Ending Index: " + end);
        } else {
            System.out.println("Maximum contiguous sum:  " + maxNeg);
            System.out.println("Starting Index: " + index + " Ending Index: " + index);
        }
    }
}
