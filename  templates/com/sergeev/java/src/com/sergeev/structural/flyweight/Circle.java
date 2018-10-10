package com.sergeev.structural.flyweight;

class Circle implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing circle , coordinates = " + x + "/" + y);

    }
}