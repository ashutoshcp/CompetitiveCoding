package org.hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HackerEarth {
    public static void main(String args[]) {
        Map<String, Integer> names = new HashMap<>();
        names.put("Anne", 10);
        names.put("John", 35);
        names.put("Bob", 2);
        Set<Map.Entry<String, Integer>> set = names.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        list.sort((order1, order2) -> (order2.getValue()).compareTo(order1.getValue()));
        for(Map.Entry<String, Integer> entry:list){
            System.out.print(" "+entry.getKey());
        }
    }

}