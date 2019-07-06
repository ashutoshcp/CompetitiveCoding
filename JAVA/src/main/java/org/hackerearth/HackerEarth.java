package org.hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HackerEarth {
    int[] fib = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
    public static void main(String[] args) {
        String sentence = "Hello hi bi bye.";
        sentence =  sentence.substring(0, sentence.length()-1);
        sentence = sentence.toLowerCase();
        String[] split = sentence.split(" ");
        StringBuilder solution = new StringBuilder();
        Map<Integer, List<String>> map = new TreeMap<>();
        Arrays.stream(split).forEach(s -> {
            int l = s.length();
            map.putIfAbsent(l, new ArrayList<>());
            map.get(l).add(s);
        });
        map.forEach((key, value) -> value.forEach(s -> solution.append(s).append(" ")));
        String ans = solution.toString().trim();
        ans = ans.substring(0,1).toUpperCase() + ans.substring(1) + ".";

        System.out.println(ans);
    }

}