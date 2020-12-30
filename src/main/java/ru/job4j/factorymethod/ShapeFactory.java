package ru.job4j.factorymethod;

public class ShapeFactory {
    private final ShapeAbstFactory factory;

    public ShapeFactory(ShapeAbstFactory factory) {
        this.factory = factory;
    }

    public Shape create(String name) {

        Shape shape = factory.createEmpty();
        if ("triangle".equals(name)) {
            shape = factory.createTriangle();
        } else if ("rectangle".equals(name)) {
            shape = factory.createRectangle();
        }
        return shape;
    }

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory(new Factory());
    }
}
