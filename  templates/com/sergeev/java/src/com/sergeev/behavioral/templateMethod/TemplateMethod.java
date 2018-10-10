package com.sergeev.behavioral.templateMethod;

public class TemplateMethod {
    public static void main(String[] args) {
        C a = new A();
        C b = new B();
        a.templateMethod();
        b.templateMethod();

    }
}
