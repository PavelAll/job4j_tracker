package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> o = Arrays.asList(origin.split("\\ "));
        List<String> l = Arrays.asList(line.split("\\ "));
        HashSet<String> check = new HashSet<>();
        for (int i = 0; i < o.size(); i++) {
            String word = o.get(i).replaceAll("\\p{Punct}", "");
            check.add(word);
        }
        if (check.containsAll(l)) {
            return true;
        }
        return false;
    }
}
