package org.codechef.APR.APRIL19B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Problem: https://www.codechef.com/APRIL19B/problems/MAXREM/
 */
public class MAXREM {

    public static void main(String[] args) throws IOException {
        MAXREM maxrem = new MAXREM();
        maxrem.process();
    }

    private void process() throws IOException {
        BufferedReader input = getBufferedReaderInputStream();
        int N = Integer.parseInt(input.readLine());
        long[] nArrayElements = new long[N];
        String inputLineToParse = input.readLine();
        int inputIndex = 0;
        for (String each : inputLineToParse.split(" ")) {
            nArrayElements[inputIndex++] = getANumber(each);
        }

        long result = getMaxModuloFromArray(N, nArrayElements);

        System.out.println(result);
    }

    private long getMaxModuloFromArray(int n, long[] nArrayElements) {
        long result = 0;
        Arrays.sort(nArrayElements);
        for (int j = n - 2; j >= 0; --j) {
            if (result >= nArrayElements[j]) {
                break;
            }
            if (nArrayElements[j] == (nArrayElements[j + 1])) {
                continue;
            }

            for (long i = 2 * nArrayElements[j]; i <= nArrayElements[n - 1] + nArrayElements[j]; i += nArrayElements[j]) {
                int index = Arrays.binarySearch(nArrayElements, i);
                if (index < 0) {
                    index = Math.abs(index + 1);
                } else {
                    while (nArrayElements[index] == i) {
                        index--;

                        if (index == 0) {
                            index = -1;
                            break;
                        }
                    }
                    index++;
                }
                result = Math.max(result, nArrayElements[j] % nArrayElements[index - 1]);
            }
        }
        return result;
    }

    private Long getANumber(String s) {
        return Long.parseLong(s);
    }

    private BufferedReader getBufferedReaderInputStream() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
}