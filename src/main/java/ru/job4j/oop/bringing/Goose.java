package ru.job4j.oop.bringing;

public class Goose implements Animal {

    @Override
    public void sound() {
        System.out.println(this.getClass().getSimpleName() + " приносит перо для подушек.");
    }

    public void bringFeather() {
    }
}
