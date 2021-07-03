package ru.job4j.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, -3, 8, 10, -5, -24, 33, -64);
        List<Integer> positiveNumbers = numbers.stream().filter(
                num -> num > 0
        ).collect(Collectors.toList());
        positiveNumbers.forEach(System.out::println);
    }
}
