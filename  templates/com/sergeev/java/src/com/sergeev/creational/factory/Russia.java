package com.sergeev.creational.factory;

public class Russia implements Language{
    @Override
    public void speak() {
        System.out.println("Привет,я русский");
    }
}
