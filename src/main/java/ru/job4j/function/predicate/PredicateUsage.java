package ru.job4j.function.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateUsage {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.isEmpty();
        System.out.println("Строка пустая: " + predicate.test(""));
        System.out.println("Строка пустая: " + predicate.test("test"));

        BiPredicate<String, Integer> cond = (s, i) -> s.contains(i.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("test123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 123));
    }
}
