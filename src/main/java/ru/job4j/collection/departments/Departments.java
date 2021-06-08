package ru.job4j.collection.departments;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String starts = "";
            for (String el : value.split("/")) {

                if (tmp.contains(starts)) {
                    starts += "/" + el;
                    tmp.add(starts);
                } else {
                    tmp.add(el);
                    starts = el;
                }
            }
        }
        return new ArrayList(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
