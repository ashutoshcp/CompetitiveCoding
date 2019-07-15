package org.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19};
        int size = arr.length - 1;
        int[] newNum = {11, 12, 6, 18};
        List<Integer>  integers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int search = binarySearch(arr, 0, size, newNum[i]);
            System.out.println(search + " " + newNum[i]);
            integers.add(search - newNum[i]);
        }
        Collections.sort(integers);
        System.out.println(integers);
    }

    private static int binarySearch(int[] arr, int l, int r, int x) {
        System.out.println("x: " + x);
        while (l <= r) {
            System.out.println(l + " " + r);
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return arr[m];
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return arr[l];
    }
}
