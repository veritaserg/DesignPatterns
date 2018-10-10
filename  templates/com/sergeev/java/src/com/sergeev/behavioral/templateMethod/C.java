package com.sergeev.behavioral.templateMethod;

public abstract class C {
        void templateMethod(){
        System.out.print("1 ");
        System.out.print("2 ");
        differ();
        System.out.print("3 ");
        differ2();
        }
abstract void differ();
abstract void differ2();
        }

