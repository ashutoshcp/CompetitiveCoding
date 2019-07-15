package org.codechef.JULY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CHFM {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0) {
            Integer N = Integer.parseInt(bufferedReader.readLine());
            Map<Integer, List<Integer>> map = new TreeMap<>();
            List<Integer> values = new ArrayList<>();
            String row = bufferedReader.readLine();
            int i = 0;
            for (String s : row.split(" ")) {
                int key = Integer.parseInt(s);
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(i);
                values.add(key);
                i++;
            }

            Collections.sort(values);

            Double SUM = 0.0;
            for (i = 0; i < N; i++) {
                SUM = SUM + values.get(i);
            }
            Double AM = SUM / N;
            //Map<Integer, Long> val = new TreeMap<>();
            boolean found = false;
            i = 0;
            int index = -1;
            for (; i < N; i++) {
                Integer integer = values.get(i);
                Double AM1 = (SUM - integer) / (N - 1);
                if (AM1.equals(AM)) {
                    index = map.get(integer).get(0) + 1;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(index);
            } else {
                System.out.println("Impossible");
            }

        }
    }
}
