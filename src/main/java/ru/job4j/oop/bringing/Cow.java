package ru.job4j.oop.bringing;

public class Cow implements Animal {

    @Override
    public void sound() {
        System.out.println(this.getClass().getSimpleName() + " дает человеку молоко.");
    }

    public void giveMilk() {
    }
}
