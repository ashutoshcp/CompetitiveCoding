package org.ADT;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {

    private Map<Integer, Integer> cache;

    public LRU(int capacity) {
        cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            public boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void set(int key, int value) {
        cache.put(key, value);
    }
}
