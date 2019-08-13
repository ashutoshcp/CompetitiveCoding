package org.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<List<Integer>> numbers = new ArrayList<>();
        while (n-- > 0) {
            String line = bufferedReader.readLine();
            List<Integer> inner = new ArrayList<>();
            for (String num : line.split(" ")) {
                inner.add(Integer.parseInt(num));
            }
            numbers.add(inner);
        }
        int q = Integer.parseInt(bufferedReader.readLine());
        while (q-- > 0) {
            String line = bufferedReader.readLine();
            String[] s = line.split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            x--;
            try {
                List<Integer> integers = numbers.get(x);
                    try {
                        Integer integer = integers.get(y);
                        System.out.println(integer);
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("ERROR!");
                    }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
