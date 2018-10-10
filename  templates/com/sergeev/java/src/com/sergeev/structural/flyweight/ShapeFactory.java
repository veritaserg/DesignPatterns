package com.sergeev.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shape) {
        Shape shape1 = shapes.get(shape);


        if (shape1 == null && shape.equals("круг") || shape
                == "квадрат" || shape == "точка") {
            switch (shape) {
                case "круг":
                    shape1 = new Circle();
                    break;
                case "квадрат":
                    shape1 = new Square();
                    break;
                case "точка":
                    shape1 = new Point();
                    break;

            }
            //  shapes.put(shape,shape1);
        } else {
            shape1 = new S();

            shapes.put(shape, shape1);
        }

        return shape1;
    }

}