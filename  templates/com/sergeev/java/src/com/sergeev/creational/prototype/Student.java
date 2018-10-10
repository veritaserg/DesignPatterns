package com.sergeev.creational.prototype;

public class Student implements Clone{
    private String name;
    private int age;
    private String account;

    public Student(String name, int age, String account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public Object clone() {
        Student clone = new Student(name,age,account);

        return clone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account='" + account + '\'' +
                '}';
    }
}
