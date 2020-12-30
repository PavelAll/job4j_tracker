package ru.job4j.factorymethod;

public interface ShapeAbstFactory {
    TriangleShape createTriangle();

    RectangleShape createRectangle();

    EmptyShape createEmpty();
}
