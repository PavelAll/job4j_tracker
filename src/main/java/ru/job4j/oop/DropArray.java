package ru.job4j.oop;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = new String[] {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
}
