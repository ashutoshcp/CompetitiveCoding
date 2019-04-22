package org.codechef.APR.APRIL19B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem: https://www.codechef.com/APRIL19B/problems/STRCH/
 */
public class STRCH {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(reader.readLine());
            String input = reader.readLine();
            String[] split = input.split(" ");
            // string for which need to find all the substrings
            String text = split[0];
            // a character to be searched
            if (text.length() != N) {
                throw new RuntimeException("Jhol with the input");
            }
            String search = split[1];

            long res = 0, count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == search.charAt(0)) {
                    res = i + 1;
                }
                count = count + res;
            }
            System.out.println(count);
        }
        reader.close();
    }
}
