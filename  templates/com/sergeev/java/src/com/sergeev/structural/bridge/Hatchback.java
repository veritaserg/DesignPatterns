package com.sergeev.structural.bridge;

public class Hatchback extends Car {
    public Hatchback(Make m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Hatchback");
    }
}
