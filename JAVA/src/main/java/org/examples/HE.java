package org.examples;

public class HE {

    protected  void finalize() {
        System.out.println("Coding!");
    }
    public static void main(String[] args) {
        /*ArrayList<StringBuilder> a = new ArrayList<>();
        StringBuilder s1 = new StringBuilder("1");
        StringBuilder s2 = new StringBuilder("2");
        StringBuilder s3 = new StringBuilder("3");
        StringBuilder s4 = new StringBuilder("4");
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.remove(1);
        for (StringBuilder s : a) {
            System.out.println(s);
        }
        a.remove(s3);
        a.remove(new StringBuilder("4"));
        for (StringBuilder s : a) {
            System.out.println(s);
        }*//*
        org.examples.HE he = new org.examples.HE();
        he = null;
        //System.gc();*/

        /*Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Map<String, Set<String>> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            map.putIfAbsent(pair_left[i], new HashSet<>());
            map.get(pair_left[i]).add(pair_right[i]);
            int c= map.values().stream().mapToInt(Set::size).sum();
            System.out.println(c);
        }*/
        int a = 5;
        System.out.println(a << a >> a -1);
        /*System.out.println("Hello"[1]);*/
    }
}
