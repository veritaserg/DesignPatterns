package com.sergeev.creational.abstractfactory.english;

import com.sergeev.creational.abstractfactory.Sniper;

public class EnglishSniper implements Sniper {
    @Override
    public void sniper() {
        System.out.println("I am English sniper ");
    }
}
