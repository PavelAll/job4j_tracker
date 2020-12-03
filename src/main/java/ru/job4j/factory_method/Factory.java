package ru.job4j.factory_method;

public class Factory implements ShapeAbstFactory{

    @Override
    public TriangleShape createTriangle() {
        return new TriangleShape();
    }

    @Override
    public RectangleShape createRectangle() {
        return new RectangleShape();
    }

    @Override
    public EmptyShape createEmpty() {
        return new EmptyShape();
    }
}
