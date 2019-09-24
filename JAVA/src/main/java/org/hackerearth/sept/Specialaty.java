package org.hackerearth.sept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Specialaty {
    private final BufferedReader bufferedReader;

    private Specialaty() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        Specialaty chefdil = new Specialaty();
        chefdil.process();
    }

    private void process() throws IOException {
        String s1 = bufferedReader.readLine();
        String[] sp1 = s1.split(" ");
        int N = Integer.parseInt(sp1[0]);
        int K = Integer.parseInt(sp1[1]);
        s1 = bufferedReader.readLine();
        sp1 = s1.split(" ");
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                for (int k = i; k <= j; k++) {
                    for (int l = i; l <= k ; l++) {
                        if (Long.parseLong(sp1[k]) > Long.parseLong(sp1[l])) {

                        }
                    }
                }
            }
        }
        bufferedReader.close();
    }
}
