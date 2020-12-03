package ru.job4j.factory_method;

public interface ShapeAbstFactory {
    TriangleShape createTriangle();
    RectangleShape createRectangle();
    EmptyShape createEmpty();
}
