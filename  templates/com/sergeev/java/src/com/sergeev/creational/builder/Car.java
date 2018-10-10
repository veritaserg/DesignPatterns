package com.sergeev.creational.builder;

public class Car {
    private String make;
    private Transmishion transmishion;
    private int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmishion(Transmishion transmishion) {
        this.transmishion = transmishion;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmishion=" + transmishion +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}