package org.array;

/**
 * 0 : 7 : 3
 * 4 : 7 : 5
 * 6 : 7 : 6
 * 8
 * <p>
 * 0 : 9 : 4
 * 0 : 3 : 1
 * 0
 */
public class FindMissing {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println(findMissing(arr));
    }

    private static int findMissing(int[] arr) {
        return binarySearchModified(arr, 0, arr.length - 1);
    }

    private static int binarySearchModified(int[] arr, int l, int r) {
        while (l <= r) {
            int mid = ((l + r)) / 2;
            System.out.println(l + " : " + r + " : " + mid);
            if (arr[mid] - mid == arr[0]) {
                if (arr[mid + 1] - arr[mid] > 1) {
                    return arr[mid] + 1;
                } else {
                    l = mid + 1;
                }

            } else {
                if (arr[mid] - arr[mid - 1] > 1) {
                    return arr[mid] - 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
