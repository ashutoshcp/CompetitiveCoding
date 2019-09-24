package org.codechef.sept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIBEASY {
    private final BufferedReader bufferedReader;
    private final int fibSize = 61;
    private long[] fib = new long[fibSize];

    private FIBEASY() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fibSize; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 10;
        }
    }

    public static void main(String[] args) throws IOException {
        FIBEASY chefdil = new FIBEASY();
        chefdil.process();
    }

    private void process() throws IOException {
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            Long N = Long.parseLong(bufferedReader.readLine());
            Long min = 0L;
            for (; N > 0L; ) {
                N = N >> 1;
                min++;
            }
            long index = (long) Math.pow(2, min - 1);
            long l = (index - 1) % 60;
            System.out.println(fib[(int) l]);
        }
        bufferedReader.close();
    }

}
