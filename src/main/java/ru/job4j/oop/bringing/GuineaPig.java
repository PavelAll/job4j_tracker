package ru.job4j.oop.bringing;

public class GuineaPig implements Animal {

    @Override
    public void sound() {
        System.out.println(this.getClass().getSimpleName() + " любит побегать в колесе.");
    }

    public void runInWheel() {
    }
}
