package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordsFormedBy {
    public int countCharacters(String[] words, String chars) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Character c : chars.toCharArray()) {
            int key = c - 'a';
            map1.putIfAbsent(key, 0);
            map1.put(key, map1.get(key) + 1);
        }
        for (int i = 0; i < 26; i++) {
            map1.putIfAbsent(i, 0);
        }
        int res = 0;
        for (String word : words) {
            Map<Integer, Integer> map = new HashMap<>();
            for (Character c : word.toCharArray()) {
                int key = c - 'a';
                map.putIfAbsent(key, 0);
                map.put(key, map.get(key) + 1);
            }
            boolean found = false;
            for (int i = 0; i < 26; i++) {
                map.putIfAbsent(i, 0);
                if (map.get(i) > map1.get(i)) {
                    found = true;
                }
            }
            if (!found) {
                res += word.length();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        WordsFormedBy formedBy = new WordsFormedBy();
        String[] strings = {"cat", "bt", "hat", "tree"};
        System.out.println(formedBy.countCharacters(strings, "atach"));
    }
}
