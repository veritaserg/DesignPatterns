package com.sergeev.behavioral.visitor;

public class Student implements People {
    @Override
    public void accept(Teacher teacher) {
        teacher.learn(this);
    }
}
