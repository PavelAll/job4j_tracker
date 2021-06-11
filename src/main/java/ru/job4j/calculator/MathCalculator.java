package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumSubtractAndDivision(double first, double second) {
        return subtract(first, second) + division(first, second);
    }

    public static double sumAllMathOperations(double first, double second) {
        return sum(first, second)
                + subtract(first, second)
                + division(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма операций сложения и вычитания: " + sumAndMultiply(10, 20));
        System.out.println("Сумма операций деления и вычитания: " + sumSubtractAndDivision(15, 8));
        System.out.println("Сумма всех математических операций: " + sumAllMathOperations(30, 10));
    }
}
