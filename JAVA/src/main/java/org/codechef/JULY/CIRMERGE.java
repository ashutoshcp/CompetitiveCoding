package org.codechef.JULY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CIRMERGE {

    private static int minComputation(int size, Integer[] files) {
        List<Integer> pq = new ArrayList<>(Arrays.asList(files).subList(0, size));
        int count = 0;
        while (pq.size() != 1) {
            Collections.sort(pq);
            int temp = pq.get(0) + pq.get(1);
            pq.remove(0);
            pq.remove(0);
            count += temp;
            pq.add(temp);
            if (pq.size() == 1) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.valueOf(bufferedReader.readLine());
        while (t-- > 0) {
            Integer N = Integer.valueOf(bufferedReader.readLine());
            Integer[] A = new Integer[N];
            String line = bufferedReader.readLine();
            int i = 0;
            for (String s : line.split(" ")) {
                A[i++] = Integer.parseInt(s);
            }
            System.out.println(minComputation(N, A));
        }
        bufferedReader.close();
    }
}
