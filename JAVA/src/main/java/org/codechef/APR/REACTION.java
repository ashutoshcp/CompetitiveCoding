package org.codechef.APR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REACTION {

    public static void main(String[] args) throws IOException {
        process();
    }

    private static void process() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        while (T-- > 0) {
            int R, C;
            String s = reader.readLine();
            String[] strings = s.split(" ");
            R = Integer.parseInt(strings[0]);
            C = Integer.parseInt(strings[1]);
            Integer[][] A = new Integer[R][C];
            for (int i = 0; i < R; i++) {
                String line = reader.readLine();
                String[] rows = line.split(" ");
                for (int j = 0; j < C; j++) {
                    A[i][j] = Integer.parseInt(rows[j]);
                }
            }
            Boolean stable = true;
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if ((i == 0 && j == 0) || (i == R - 1 && j == C - 1) || (i == R - 1 && j == 0) || (i == 0 && j == C - 1)) {
                        if (A[i][j] > 2) {
                            stable = false;
                            break;
                        }
                    } else if ((i == 0) || (j == 0) || (i == R - 1) || (j == C - 1)) {
                        if (A[i][j] > 3) {
                            stable = false;
                            break;
                        }
                    } else {
                        if (A[i][j] > 4) {
                            stable = false;
                            break;
                        }
                    }
                }
            }
            if (stable) {
                System.out.println("Stable");
            } else {
                System.out.println("Unstable");
            }
        }

    }
}
