package com.sergeev.creational.abstractfactory.russian;


import com.sergeev.creational.abstractfactory.Soldier;

public class RussianSoldier implements Soldier {
    @Override
    public void soldier() {
        System.out.println("Я русский солдат");
    }
}
