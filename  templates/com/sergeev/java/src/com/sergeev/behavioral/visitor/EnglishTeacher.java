package com.sergeev.behavioral.visitor;

public class EnglishTeacher implements Teacher {
    @Override
    public void learn(Student student) {
        System.out.println("Learn students.....");
    }

    @Override
    public void learn(Schoolboy schoolboy) {
        System.out.println("Learn schoolboy.....");

    }
}
