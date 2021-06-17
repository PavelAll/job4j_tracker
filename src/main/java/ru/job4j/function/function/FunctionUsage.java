package ru.job4j.function.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionUsage {
    public static void main(String[] args) {
        Function<String, Character> function = s -> s.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));
        System.out.println();
        BiFunction<String, Integer, String> biFunc = (s, i) -> s.concat(" ").concat(i.toString());
        System.out.println("Результат работы бифункции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunc.apply("String number", 12345));
    }
}
