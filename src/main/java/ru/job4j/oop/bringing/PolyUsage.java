package ru.job4j.oop.bringing;

public class PolyUsage {
    public static void main(String[] args) {

        Animal cow = new Cow();
        Animal goose = new Goose();

        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();

        Animal[] animals = new Animal[] {cow, goose, dog, guineaPig};
        for (Animal a : animals) {
            //if (a instanceof Cow) ((Cow)a).giveMilk();
            a.sound();
        }
    }
}
