package com.sergeev.structural.flyweight;

class Square implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing square , coordinates = " + x + "/" + y);

    }
}