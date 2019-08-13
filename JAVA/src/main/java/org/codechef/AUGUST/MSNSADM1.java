package org.codechef.AUGUST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MSNSADM1 {

    private final BufferedReader bufferedReader;

    private MSNSADM1() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        MSNSADM1 msnsadm1 = new MSNSADM1();
        msnsadm1.process();
    }

    private void process() throws IOException {
        int T = Integer.parseInt(bufferedReader.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(bufferedReader.readLine());
            String lineA = bufferedReader.readLine();
            String lineB = bufferedReader.readLine();
            String[] s = lineA.split(" ");
            String[] s1 = lineB.split(" ");
            assert s.length == N;
            assert s1.length == N;
            long MAX_VAL = 0L;
            for (int i = 0; i < N; i++) {
                long ithPlayer = Integer.parseInt(s[i]) * 20L - Integer.parseInt(s1[i]) * 10L;
                MAX_VAL = Math.max(ithPlayer, MAX_VAL);
            }
            System.out.println(MAX_VAL);
        }
        bufferedReader.close();
    }
}
