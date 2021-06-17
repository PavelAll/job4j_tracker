package ru.job4j.function.biconsumer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiConsumerUsage {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        BiConsumer<String, String> consumer = (s, s1) -> System.out.println(s + s1);
        consumer.accept(supplier.get(), " and Second String");

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup = () -> new HashSet<>(list);
        BiConsumer<Integer, String> con = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = sup.get();
        int i = 1;
        for (String s : strings) {
            con.accept(i++, " is " + s);
        }
    }
}