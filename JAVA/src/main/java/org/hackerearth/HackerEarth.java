package org.hackerearth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class HackerEarth {
    int[] fib = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

    static <T> void  m(T[] o, Collection<T> c) {
        for (T d : o) {
            c.add(d);
        }
    }
    public static void main(String[] args) {
        /*Integer[] marks = new Integer[100];
        Float[] avg = new Float[3];
        Number[] tot = new Number[4];
        Collection<Number> colNu = new ArrayList<Number>();
        Collection<Object> collOb = new ArrayList<Object>();
        m(marks, colNu);
        m(avg, colNu);
        m(tot, colNu);
        m(marks, collOb);
        *//*String sentence = "Hello hi bi bye.";
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

        System.out.println(ans);*//*
        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();

        int[] data = new int[N];
        BigInteger num = new BigInteger("0");
        BigInteger val = new BigInteger("10");
        for (int i = 0; i < N; i++) {
            data[i] = s.nextInt();
            int dig = data[i] % 10;
            num = (num.multiply(val)).add(new BigInteger(String.valueOf(dig)));
        }


        // Write your code here
        // ans =
        String ans = "No";
        if (num.mod(val).equals(new BigInteger("0"))) {
            ans = "Yes";
        }

        System.out.println(ans);*/

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String v = iterator.next();
            System.out.print(" " + v);
            if (v.equals("2")) {
                strings.remove(v);
            }
        }
    }

}