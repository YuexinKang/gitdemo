package com.soft1841.Demo9;

public class FactoryTest {
    public static void main(String[] args) {
        Shape circle=ShapeFactory.getCircleInstance();
        circle.draw();
        Shape rectangle=ShapeFactory.getRectangleInstance();
        rectangle.draw();
    }
}
