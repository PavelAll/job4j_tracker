package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {

        String[] names = {"Pavel", "Ivan", "Boris", "Aleksey"};
        Comparator<String> cmpText = (left, right) -> {
            return left.compareTo(right);
        };
        Arrays.sort(names, cmpText);
        System.out.println(Arrays.toString(names));

        System.out.println("\n");

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(names, cmpDescSize);
        System.out.println(Arrays.toString(names));
    }
}
