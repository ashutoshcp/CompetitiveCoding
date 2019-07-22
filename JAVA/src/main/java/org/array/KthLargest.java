package org.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KthLargest {
    private static BufferedReader bufferedReader;
    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bufferedReader.readLine());
        System.out.println("K is: " + k);
        getKthLargest(k);
    }

    private static void getKthLargest(int k) throws IOException {
        int count = 0, x;
        int[] arr = new int[k];
        MinHeap minHeap = new MinHeap(arr, k);
        while (true) {
            System.out.println("Number from Stream");
            x = Integer.parseInt(bufferedReader.readLine());
            if (count < k-1) {
                arr[count++] = x;
            } else {
                if (count == k-1) {
                    arr[count] = x;
                    minHeap.buildHeap();
                } else {
                    if (x > minHeap.getMin()) {
                        minHeap.replaceMin(x);
                    }
                }
                System.out.println(k + "th largest element: " + minHeap.getMin());
                count++;
            }
        }
    }
}
