package com.sergeev.creational.builder;

public class BmwCar extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("BMW");
    }

    @Override
    void buildTransmishion() {
        car.setTransmishion(Transmishion.AVTO);
    }

    @Override
    void buildSpeed() {
        car.setMaxSpeed(350);

    }
}
