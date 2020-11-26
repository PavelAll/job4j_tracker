package ru.job4j.oop;

public class Train implements Vehicle {
    private String className = getClass().getSimpleName();

    @Override
    public void arrival() {
        System.out.println(className + " Прибываю на жд вокзал Питера");
    }

    @Override
    public void move() {
        System.out.println(className + " Отправляюсь с жд вокзала Москвы в Питер");
    }
}
