package ru.job4j.collection.sortnumbers;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[]lefts = left.split("\\.");
        String[]rights = right.split("\\.");

        for (int i = 0; i < Math.min(lefts.length, rights.length); i++) {
            try {
                if (Integer.parseInt(lefts[i]) != Integer.parseInt(rights[i])) {
                    return Integer.compare(Integer.parseInt(lefts[i]), Integer.parseInt(rights[i]));
                }
            } catch (NumberFormatException e) {
                return Integer.compare(left.length(), right.length());
            }
        }
        return 0;
    }
}
