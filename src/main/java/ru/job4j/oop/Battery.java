package ru.job4j.oop;

public class Battery {
    private int load;

    private Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(95);
        Battery second = new Battery(5);
        System.out.println("Power first battery: " + first.load + "%. Power second battery: " + second.load + "%.");
        first.exchange(second);
        System.out.println("Power first battery: " + first.load + "%. Power second battery: " + second.load + "%.");
    }
}
