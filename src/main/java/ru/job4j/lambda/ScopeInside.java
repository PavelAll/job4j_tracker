package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        String ayyyy = "ayyyyy";
        String name = echo(
                () -> {
                    return ayyyy;
                }
        );

        System.out.println(name);
        System.out.println(ayyyy);

        int[] number = {1, 2, 3, 4};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            int tmp = total;
            total = add(
                    () -> tmp + num
            );
        }
        System.out.println(total);
    }

    public static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }

    public static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }
}
