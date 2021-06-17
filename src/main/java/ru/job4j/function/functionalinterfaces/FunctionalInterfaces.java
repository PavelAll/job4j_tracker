package ru.job4j.function.functionalinterfaces;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (i, s) -> map.put(i, s);

        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");

        BiPredicate<Integer, String> biPredicate = (i, s) -> {
            return i % 2 == 0 || s.length() == 4;
        };
        for (Integer i : map.keySet()) {
            if (biPredicate.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();

        Consumer<String> consumer = (s) -> System.out.println(s);
        Function<String, String> function = (s) -> s.toUpperCase();
        for (String s : strings) {
            consumer.accept(function.apply(s));
        }
    }
}
