package org.mine.initial;

import java.util.Comparator;

// Write your Checker class here
public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.getScore() == b.getScore()) {
            return a.getName().compareTo(b.getName());
        } else {
            return b.getScore() - a.getScore();
        }
    }
}
