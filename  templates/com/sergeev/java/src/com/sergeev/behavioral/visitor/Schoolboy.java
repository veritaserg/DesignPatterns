package com.sergeev.behavioral.visitor;

public class Schoolboy implements People {
    @Override
    public void accept(Teacher teacher) {
        teacher.learn(this);
    }
}
