package ru.job4j.collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        String[]s1 = str1.split("/");
        String[]s2 = str2.split("/");
        int rsl = s2[0].compareTo(s1[0]);
        return rsl == 0 ? str1.compareTo(str2) : rsl;
    }
}
