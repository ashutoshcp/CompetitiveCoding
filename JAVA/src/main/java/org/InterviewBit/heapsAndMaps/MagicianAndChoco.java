package org.InterviewBit.heapsAndMaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MagicianAndChoco {
    public int nchoc(int A, ArrayList<Integer> B) {
        final int MOD = (int) 1e9 + 7;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(B);
        long ans = 0;
        while (A-- > 0) {
            int c = priorityQueue.poll();
            ans += c;
            ans %= MOD;
            priorityQueue.add(c / 2);
        }
        return (int) ans;

    }
}
