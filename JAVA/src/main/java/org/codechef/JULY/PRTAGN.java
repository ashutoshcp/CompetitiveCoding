package org.codechef.JULY;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class PRTAGN {

    private static class Pair<T1, T2> {
        private T1 x;
        private T2 y;

        public Pair(T1 x, T2 y) {
            this.x = x;
            this.y = y;
        }

        public T1 getX() {
            return x;
        }

        public T2 getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(getX(), pair.getX()) &&
                    Objects.equals(getY(), pair.getY());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getX(), getY());
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private static int myXOR(int x, int y) {
        return (x | y) - (x & y);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Integer t = scanner.nextInt();
        Map<Integer, Integer> bitCountMap = new HashMap<>();
        Map<Pair<Integer, Integer>, Integer> myXorMap = new HashMap<>();
        while (t-- > 0) {
            Integer Q = scanner.nextInt();
            Set<Integer> nums = new HashSet<>();
            int odd_count = 0;
            int even_count = 0;
            while (Q-- > 0) {
                Integer X = scanner.nextInt();
                if (!nums.contains(X)) {

                    int bitCount;
                    if (bitCountMap.containsKey(X)) {
                        bitCount = bitCountMap.get(X);
                    } else {
                        bitCount = Integer.bitCount(X);
                        bitCountMap.put(X, bitCount);
                    }
                    if (bitCount % 2 == 0) {
                        even_count++;
                    } else {
                        odd_count++;
                    }
                    nums.add(X);
                }
                Set<Integer> queue = (HashSet<Integer>) ((HashSet<Integer>) nums).clone();
                for (Integer i : queue) {
                    if (!i.equals(X)) {
                        Integer xx;
                        int min = Math.min(i, X);
                        int max = Math.max(i, X);
                        Pair<Integer, Integer> pair = new Pair<>(min, max);

                        if (myXorMap.containsKey(pair)) {
                            xx = myXorMap.get(pair);
                        } else {
                            xx = myXOR(min, max);
                            myXorMap.put(pair, xx);
                        }
                        //xx = myXOR(X, i);
                        //System.out.println("xx: " + xx);
                        if (!nums.contains(xx)) {
                            nums.add(xx);
                            int bitCount;
                            if (bitCountMap.containsKey(xx)) {
                                bitCount = bitCountMap.get(xx);
                            } else {
                                bitCount = Integer.bitCount(xx);
                                bitCountMap.put(xx, bitCount);
                            }
                            if (bitCount % 2 == 0) {
                                even_count++;
                            } else {
                                odd_count++;
                            }
                        }
                    }
                }
                //System.out.println(nums);
                System.out.println(even_count + " " + odd_count);
            }
        }
        scanner.close();
    }
}
