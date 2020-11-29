package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int num = -1;
        int result = fact.calc(num);
        System.out.println("Factorial number " + num + " is " + result);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must not be less than zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
