package com.sergeev.behavioral.visitor;

public class RussianTeacher implements Teacher {
    @Override
    public void learn(Student student) {
        System.out.println("Учу студентов.....");
    }

    @Override
    public void learn(Schoolboy schoolboy) {
        System.out.println("Учу школьников....");

    }
}
