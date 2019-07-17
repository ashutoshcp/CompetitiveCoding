package org.codechef.JULY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MMAX {
    public static void main(String[] args) throws IOException {
        int N, K, T;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bufferedReader.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(bufferedReader.readLine());
            K = Integer.parseInt(bufferedReader.readLine());
            int low = Math.min(K % N, (N - K) % N);
            System.out.println(Math.min(N - 1, 2 * low));
        }
    }
}
/**
 * You need to distribute
 * K
 *  chocolates among N
 *  people, such that if the
 * i
 * t
 * h
 *  person receives
 * A
 * [
 * i
 * ]
 * chocolates, the sum
 * S
 * 1
 * =
 * ∑
 * N
 * i
 * =
 * 1
 * a
 * b
 * s
 * (
 * A
 * [
 * i
 * ]
 * −
 * A
 * [
 * i
 * −
 * 1
 * ]
 * )
 *  is minimum.
 *
 * Now, after doing so, you need to rearrange the elements of array
 * A
 *  in such a way that the sum
 * S
 * 2
 * =
 * ∑
 * N
 * i
 * =
 * 1
 * a
 * b
 * s
 * (
 * A
 * [
 * i
 * ]
 * −
 * A
 * [
 * i
 * −
 * 1
 * ]
 * )
 *  is maximum. You need to print this number.
 *
 * However, there is a small catch here. The number
 * K
 *  may be as large as
 * 10
 * 10
 * 5
 */
