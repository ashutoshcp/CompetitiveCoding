package org.codechef.AUGUST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFDIL {

    private final BufferedReader bufferedReader;

    private CHEFDIL() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        CHEFDIL chefdil = new CHEFDIL();
        chefdil.process();
    }

    private void process() throws IOException {
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0) {
            String line = bufferedReader.readLine();
            int count1 = 0;
            int l = line.length();
            for (int i = 0; i < l; i++) {
                if (line.charAt(i) == '1') {
                    count1++;
                }
            }
            if (count1 % 2 == 1) {
                System.out.println("WIN");
            } else {
                System.out.println("LOSE");
            }

        }
        bufferedReader.close();
    }
}
