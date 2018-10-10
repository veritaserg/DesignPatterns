package com.sergeev.creational.abstractfactory.russian;

import com.sergeev.creational.abstractfactory.Scout;

public class RussianScout implements Scout {
    @Override
    public void scout() {
        System.out.println("Я русский разведчик");
    }
}
