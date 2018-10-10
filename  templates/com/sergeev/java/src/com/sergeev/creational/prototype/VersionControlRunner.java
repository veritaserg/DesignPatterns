package com.sergeev.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Student student = new Student("Ivanov", 18, "www.mail.ru");
        System.out.println(student);

        StudentFactory studentFactory = new StudentFactory(student);
        Student cloneStudent = studentFactory.cloneStudent();

        System.out.println(cloneStudent);
    }
}