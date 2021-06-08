package ru.job4j.collection.departments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        String[]s1 = str1.split("/");
        String[]s2 = str2.split("/");
        if (s2[0].compareTo(s1[0]) == 0) {
            for (int i = 1; i < Math.min(s1.length, s2.length); i++) {
                if (s1[i].compareTo(s2[i]) == 0) {
                    continue;
                }
                return s1[i].compareTo(s2[i]);
            }
        } else {
            return s2[0].compareTo(s1[0]);
        }
        return Integer.compare(str1.length(), str2.length());
    }
}
