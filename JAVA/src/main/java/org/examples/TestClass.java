package org.examples;/*
import java.io.*;
import java.util.*;


public class org.examples.TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            String[] inp = br.readLine().trim().split(" ");
            X[i] = Integer.parseInt(inp[0]);
            Y[i] = Integer.parseInt(inp[1]);
        }
        int[][] out = solve(N, X, Y);
        for (int i = 0; i < N; i++) wr.println(out[i][0] + " " + out[i][1]);
        wr.close();
        br.close();
    }

    private static  class Interval {
        int s;
        int e;

        public Interval(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    static int[][] solve(int N, int[] X, int[] Y) {
        // Modify and print X and Y in the required order
        List<Interval> intervals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            intervals.add(new Interval(X[i], Y[i]));
        }
        intervals.sort((o1, o2) -> {
            if (o1.s == o2.s) {
                return o2.e - o1.e;
            }
            return o1.s - o2.s;
        });
        int[][] res = new int[N][2];
        int i1 = 0;
        for (Interval i : intervals) {
            res[i1][0] = i.s;
            res[i1][1] = i.e;
            i1++;
        }
        intervals.clear();
        return res;
    }
}*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        String out_ = Solution(A, C, B);
        System.out.println(out_);
        wr.close();
        br.close();
    }
    static String Solution(String A, String C, String B){
        // Write your code here
        Map<Character, Character> map = new TreeMap<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            char value = A.charAt(i);
            if (map.get(c) == null) {
                map.put(c, value);
            } else {
                Character character = map.get(c);
                if ((int)character > (int) value) {
                    map.put(c, value);
                }
            }
        }

        for (int i = 0; i < C.length(); i++) {
            char c = C.charAt(i);
            Character obj = map.get(c);
            if (obj != null) {
                if (c > obj) {
                    res.append(obj);
                } else {
                    res.append(c);
                }
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}