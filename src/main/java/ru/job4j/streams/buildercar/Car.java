package ru.job4j.streams.buildercar;

import java.util.Arrays;

public class Car {
    private Engine engine;
    private Door[] door;
    private Wheel[] wheel;
    private Glass[] glass;
    private Mirror[] mirror;

    static class Builder {
        private Engine engine;
        private Door[] door;
        private Wheel[] wheel;
        private Glass[] glass;
        private Mirror[] mirror;

        Builder buildEngine(double volume) {
            this.engine = new Engine(volume);
            return this;
        }

        Builder buildDoor(int count) {
            door = new Door[count];
            for (int i = 0; i < door.length; i++) {
                door[i] = new Door(i + 1);
            }
            return this;
        }

        Builder buildWheel(int count) {
            wheel = new Wheel[count];
            for (int i = 0; i < wheel.length; i++) {
                this.wheel[i] = new Wheel(i + 1);
            }
            return this;
        }

        Builder buildGlass(int count) {
            glass = new Glass[count];
            for (int i = 0; i < glass.length; i++) {
                this.glass[i] = new Glass(i + 1);
            }
            return this;
        }

        Builder buildMirror(int count) {
            mirror = new Mirror[count];
            for (int i = 0; i < mirror.length; i++) {
                this.mirror[i] = new Mirror(i + 1);
            }
            return this;
        }

        Car builder() {
            Car car = new Car();
            car.engine = engine;
            car.door = door;
            car.wheel = wheel;
            car.glass = glass;
            car.mirror = mirror;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" + "engineVolume=" + engine
                + ", doors=" + Arrays.stream(door).count()
                + ", wheels=" + Arrays.stream(wheel).count()
                + ", glasses=" + Arrays.stream(glass).count()
                + ", mirrors=" + Arrays.stream(mirror).count() + '}';
    }
}

class Engine {
    private double volume;

    public Engine(double volume) {
        this.volume = volume;
    }

    @Override
    public String

    toString() {
        return "Engine{" + "volume=" + volume + '}';
    }
}

class Door {
    private int number;

    public Door(int number) {
        this.number = number;
    }
}

class Wheel {
    private int number;

    public Wheel(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Wheel{" + "count=" + number + '}';
    }
}

class Glass {
    private int number;

    public Glass(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Glass{" + "count=" + number + '}';
    }
}

class Mirror {
    private int number;

    public Mirror(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Mirror{" + "count=" + number + '}';
    }
}

