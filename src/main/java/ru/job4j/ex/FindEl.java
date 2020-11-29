package ru.job4j.ex;

import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if(rsl == -1) {
            throw new ElementNotFoundException("Element Not found exception");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            int index = indexOf(new String[]{"Ivan", "Vasya", "Pavel"}, "Masha" );
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
