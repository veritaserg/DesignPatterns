package com.sergeev.creational.builder;

public abstract class CarBuilder {
    Car car;

    void creatCar() {
        car = new Car();
    }

    abstract void buildMake();

    abstract void buildTransmishion();

    abstract void buildSpeed();

    Car getCar() {
        return car;
    }


}
