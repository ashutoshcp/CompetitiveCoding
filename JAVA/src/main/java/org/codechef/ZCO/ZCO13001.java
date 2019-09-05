package org.codechef.ZCO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZCO13001 {
    private final BufferedReader bufferedReader;

    public ZCO13001() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        ZCO13001 zco13001 = new ZCO13001();
        zco13001.process();
    }

    private void process() throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        Long[] A = new Long[N];
        String readLine = bufferedReader.readLine();
        int i = 0;
        Long sum = 0L;
        for (String s : readLine.split(" ")) {
            A[i] = Long.parseLong(s);
            sum += A[i];
            i++;
        }
        Arrays.sort(A);
        long tot = 0L, tr = 0L;
        for (int j = 0; j < N; j++) {
            tot += sum - ((N - j) * A[j]) - tr;
            tr += A[j];
        }
        System.out.println(tot);
    }
}
