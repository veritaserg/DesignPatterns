package com.sergeev.behavioral.visitor;

public class SchoolApp {
    public static void main(String[] args) {
AllPeople allPeople = new AllPeople();
Teacher eng = new EnglishTeacher();
Teacher rus = new RussianTeacher();

allPeople.accept(eng);



    }
}
