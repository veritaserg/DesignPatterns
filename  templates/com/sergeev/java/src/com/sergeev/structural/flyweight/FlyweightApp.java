package com.sergeev.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightApp {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("куг"));

        for (Shape shape : shapes) {
            shape.draw(14, 15);
        }


    }
}
