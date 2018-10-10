package com.sergeev.creational.abstractfactory.russian;

import com.sergeev.creational.abstractfactory.Sniper;

public class RussianSniper implements Sniper {
    @Override
    public void sniper() {
        System.out.println("Я русский снайпер");
    }
}
