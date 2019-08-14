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

    private List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastNum = 0;
        List<List<Integer>> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(new ArrayList<>());
        }
        List<Integer> res = new ArrayList<>();

        for(List<Integer> lists: queries) {
            int type = lists.get(0);
            int x = lists.get(1);
            int y = lists.get(2);
            int indx =(x ^ lastNum)%n;
            if(type == 1) {
                nums.get(indx).add(y);
            } else {
                int size = nums.get(indx).size();
                lastNum = nums.get(indx).get(y%size);
                res.add(lastNum);
            }
        }

        return res;
    }
}
