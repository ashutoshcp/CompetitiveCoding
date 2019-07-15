package org.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountPathInMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());
        int paths = getPaths(M, N);
        System.out.println(paths);
    }

    private static int getPaths(int m, int n) {
        int paths = 1;
        for (int i = n; i < (m + n - 1); i++) {
            paths *= i;
            paths /= (i - n + 1);
        }
        return paths;
    }
}
