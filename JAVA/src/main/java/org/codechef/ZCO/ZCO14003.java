package org.codechef.ZCO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZCO14003 {
    private final BufferedReader bufferedReader;

    public ZCO14003() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        ZCO14003 zco14003 = new ZCO14003();
        zco14003.process();
    }

    private void process() throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(bufferedReader.readLine());
        }
        Arrays.sort(A);
        long ans = -1L;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, A[i] * (N - i));
        }
        System.out.println(ans);
        bufferedReader.close();
    }
}
