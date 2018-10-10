package com.sergeev.creational.builder;

public class Director {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.creatCar();
        carBuilder.buildMake();
        carBuilder.buildTransmishion();
        carBuilder.buildSpeed();
        Car car = carBuilder.getCar();
        return car;
    }

}
