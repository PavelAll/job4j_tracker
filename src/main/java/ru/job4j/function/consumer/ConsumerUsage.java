package ru.job4j.function.consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String For Interface";
        Consumer<String> consumer  = (s) -> System.out.println(s + " Hello");
        consumer.accept(sup.get());
    }
}
