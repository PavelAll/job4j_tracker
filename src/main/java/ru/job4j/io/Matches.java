package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11, player = 0, count = 0;
        System.out.println("Игра 11 спичек");

        while (matches > 0) {
            count = count == 1 ? 2 : 1;
            System.out.print("Игрок " + count + " введите число от (1 до 3): ");
            player = Integer.valueOf(input.nextLine());

            if (player >= 1 && player <= 3) {
                matches -= player;
                System.out.println("На столе осталось спичек: " + matches);
            } else {
                System.out.println("Не верный ввод ");
                count = count == 1 ? 2 : 1;
            }
        }
        System.out.println("Победил игрок: " + count);
    }
}
