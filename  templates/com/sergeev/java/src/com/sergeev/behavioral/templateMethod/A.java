package com.sergeev.behavioral.templateMethod;

class A extends C {
    @Override
    void differ() {
        System.out.print("2.1 ");
    }

    @Override
    void differ2() {
        System.out.println("3.1 ");

    }
}