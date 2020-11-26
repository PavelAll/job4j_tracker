package ru.job4j.oop.bringing;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println(this.getClass().getSimpleName() + " не любит кошек, постоянно за ними гоняется.");
    }

    public void runAfterCat() {
    }
}
