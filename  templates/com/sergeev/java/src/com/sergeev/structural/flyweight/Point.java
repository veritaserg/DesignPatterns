package com.sergeev.structural.flyweight;

class Point implements Shape{

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing point , coordinates = " + x+"/" + y );

    }
}
