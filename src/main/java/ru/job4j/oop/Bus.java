package ru.job4j.oop;

public class Bus implements Vehicle {
    private String className = getClass().getSimpleName();

    @Override
    public void arrival() {
        System.out.println(className + " Прибываю на автовокзал Питера");
    }

    @Override
    public void move() {
        System.out.println(className + " Отправляюсь с автовокзала Москвы в Питер");
    }
}
