package ru.job4j.oop;

public class Aircraft implements Vehicle {
    private String className = getClass().getSimpleName();

    @Override
    public void arrival() {
        System.out.println(className + " Начинаю посадку в аэропорту Питера");
    }

    @Override
    public void move() {
        System.out.println(className + " Начинаю взлет в аэропорту Москвы на Питер");
    }
}
