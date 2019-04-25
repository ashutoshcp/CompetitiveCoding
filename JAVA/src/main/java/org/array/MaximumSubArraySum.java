package org.array;

public class MaximumSubArraySum {

    public MaximumSubArraySum() {
    }

    public static void main(String[] args) {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = array.length;
        maximumSubArraySum.maximumSumSubArray(array, n);
    }

    private void maximumSumSubArray(int[] arr, int size) {
        int start = 0, end = 0, maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0, currentStart = 0;
        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                currentStart = i + 1;
            } else if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = currentStart;
                end = i;
            }
        }
        System.out.println("Maximum contiguous sum:  " + maxSoFar);
        System.out.println("Starting Index: " + start + " Ending Index: " + end);
    }
}
