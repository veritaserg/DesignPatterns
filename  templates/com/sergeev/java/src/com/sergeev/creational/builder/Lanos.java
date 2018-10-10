package com.sergeev.creational.builder;

public class Lanos extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("Lanos");
    }

    @Override
    void buildTransmishion() {
        car.setTransmishion(Transmishion.MANUAL);
    }

    @Override
    void buildSpeed() {
        car.setMaxSpeed(180);

    }
}
