package com.sergeev.creational.abstractfactory.english;

import com.sergeev.creational.abstractfactory.Soldier;

public class EnglishSoldier implements Soldier {
    @Override
    public void soldier() {
        System.out.println("I am English soldier");
    }
}
