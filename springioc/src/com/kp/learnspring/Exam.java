package com.kp.learnspring;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String title;  // will reference to value

   /* This is not a right approach as initialization and population is done by us & more importantly objects are tightly coupled.

    List<com.kp.learn.Student> students = new ArrayList<>();
    students.add(student1);*/

    /* Instead just defined the dependency and inject using setter method  setStudents from config file */

    private List<Student> students; // will reference to object

    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Exam(String title) {
        this.title = title;
        this.students = new ArrayList<>(); // this is still not right approach
    }

    public Exam(String title, List<Student> students) {
        this.title = title;
        this.students = students;
    }

    public  void addStudent(Student student){
        this.students.add(student);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int no_of_students() {

        return students.size();
    }

    public void getAllStudent() {

        students.forEach(student -> System.out.println(student.toString()));
    }

    public String getTitle() {
        return title;
    }
}
