package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да мой юный друг.");
        } else if (answer == 1) {
            System.out.println("Нет мой юный друг.");
        } else {
            System.out.println("Может быть мой юный друг.");
        }
    }
}
