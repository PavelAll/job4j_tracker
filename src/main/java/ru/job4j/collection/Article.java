package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> o = Arrays.asList(origin.split("\\ "));
        List<String> l = Arrays.asList(line.split("\\ "));

        for (int i = 0; i < o.size(); i++) {
            String s = o.get(i).replaceAll("\\p{Punct}", "").trim();
            o.set(i, s);
        }

        if (o.containsAll(l)) {
            return true;
        }
        return false;
    }
}
