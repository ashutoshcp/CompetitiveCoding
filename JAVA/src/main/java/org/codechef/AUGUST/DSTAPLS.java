package org.codechef.AUGUST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DSTAPLS {

    private final BufferedReader bufferedReader;

    private DSTAPLS() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        DSTAPLS dstapls = new DSTAPLS();
        dstapls.process();
    }

    private void process() throws IOException {
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0) {
            String line = bufferedReader.readLine();
            String[] split = line.split(" ");
            assert split.length == 2;
            BigInteger N = new BigInteger(split[0]);
            BigInteger K = new BigInteger(split[1]);
            N = N.divide(K);
            if (!N.mod(K).equals(new BigInteger("0"))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        bufferedReader.close();
    }
}
