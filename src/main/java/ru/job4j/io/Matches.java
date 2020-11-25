package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11 , user = 0;
        System.out.println("Игра 11 спичек");
        while (run) {
            System.out.print("Первый игрок введите число от (1 до 3): ");
            user = Integer.valueOf(input.nextLine());
            matches -= user;
            System.out.println("На столе осталось спичек: " + matches);
            if (matches <= 0) {
                System.out.println("Игрок 1 победил");
                break;
            }
            System.out.print("Второй игрок введите число от (1 до 3): ");
            user = Integer.valueOf(input.nextLine());
            matches -= user;
            System.out.println("На столе осталось спичек: " + matches);
            if (matches <= 0) {
                System.out.println("Игрок 2 победил");
                break;
            }
        }
    }
}
