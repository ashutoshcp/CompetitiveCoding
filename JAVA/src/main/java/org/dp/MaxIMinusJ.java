package org.dp;

public class MaxIMinusJ {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        System.out.println(maxIDiffJ(arr));
    }

    private static int maxIDiffJ(int[] arr) {
        int l = arr.length;
        int[] LMin = new int[l];
        int[] RMax = new int[l];
        LMin[0] = arr[0];
        RMax[l - 1] = arr[l - 1];
        for (int i = 1; i < l; i++) {
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
        }
        for (int i = l - 2; i >= 0; i--) {
            RMax[i] = Math.max(arr[i], RMax[i + 1]);
        }
        int i = 0, j = 0, maxDiff = Integer.MIN_VALUE;
        int si = 0, ei = 0;
        while (j < l && i < l) {
            if (LMin[i] < RMax[j]) {
                //maxDiff = Math.max(maxDiff, j-i);
                if (maxDiff < j - i) {
                    maxDiff = j - i;
                    si = i;
                    ei = j;
                }
                j++;
            } else {
                i++;
            }
        }
        System.out.println(si + " " + ei);
        return maxDiff;
    }
}
