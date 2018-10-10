package com.sergeev.structural.bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car c = new Sedan(new Kia());
        c.showDetails();
    }
}
