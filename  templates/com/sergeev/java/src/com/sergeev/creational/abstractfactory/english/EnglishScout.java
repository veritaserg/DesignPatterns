package com.sergeev.creational.abstractfactory.english;

import com.sergeev.creational.abstractfactory.Scout;

public class EnglishScout implements Scout {
    @Override
    public void scout() {
        System.out.println("I am English Scout");
    }
}
