package ru.job4j.oop;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle air = new Aircraft();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[] {air, train, bus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.arrival();
        }
    }
}
