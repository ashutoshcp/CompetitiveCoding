package org.codechef.sept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Ref: https://www.geeksforgeeks.org/print-subsets-given-size-set/
 */
public class CHEFINSQ {

    private final BufferedReader bufferedReader;
    private static int count = 0;

    private CHEFINSQ() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }


    public static void main(String[] args) throws IOException {
        CHEFINSQ chefdil = new CHEFINSQ();
        chefdil.process();
    }

    private void process() throws IOException {
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            count = 0;
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            Integer N = Integer.parseInt(s1[0]);
            Integer K = Integer.parseInt(s1[1]);
            s = bufferedReader.readLine();
            s1 = s.split(" ");
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(s1[j]);
            }
            Arrays.sort(arr);
            int sum = 0;
            for (int j = 0; j < K; j++) {
                sum += arr[j];
            }
            countCombination(arr, N, K, sum);
            System.out.println(count);
        }
        bufferedReader.close();
    }

    private void combinationUtilGFGCopy(int[] arr, int n, int r, int index, int[] data, int i, int sum) {
        if (index == r) {
            int val = 0;
            for (int j = 0; j < r; j++) {
                val += data[j];
            }
            if (val == sum) {
                count++;
            }
            return;
        }
        if (i >= n) {
            return;
        }
        data[index] = arr[i];
        combinationUtilGFGCopy(arr, n, r, index + 1, data, i + 1, sum);
        combinationUtilGFGCopy(arr, n, r, index, data, i + 1, sum);
    }

    private void countCombination(int[] arr, int n, int r, int sum) {
        int[] data = new int[r];
        combinationUtilGFGCopy(arr, n, r, 0, data, 0, sum);
    }
}
