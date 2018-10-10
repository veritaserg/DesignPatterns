package com.sergeev.creational.prototype;

public class StudentFactory {
  Student student;

    public StudentFactory(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
Student cloneStudent(){
        return (Student) student.clone();
}


}
