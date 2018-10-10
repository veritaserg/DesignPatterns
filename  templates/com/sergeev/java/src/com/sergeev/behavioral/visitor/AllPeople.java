package com.sergeev.behavioral.visitor;

public class AllPeople implements People{
People[] people;

    public AllPeople() {
        this.people = new People[]{
                new Student(),new Schoolboy()
        };
    }

    @Override
    public void accept(Teacher teacher) {
        for (People people : people){
            people.accept(teacher);
        }

    }
}
