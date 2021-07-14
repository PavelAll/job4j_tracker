package ru.job4j.streams.buildercar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().buildEngine(2.5)
                .buildDoor(4)
                .buildWheel(4)
                .buildGlass(6)
                .buildMirror(2)
                .builder();
        System.out.println(car);
    }
}
