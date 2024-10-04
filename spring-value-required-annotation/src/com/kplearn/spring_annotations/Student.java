package com.kplearn.spring_annotations;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${student.name}")
    private String name;
    private String interestedCourse;
    private String interestedGames;


    public Student(@Value("${student.name}") String name,@Value("${student.interestedCourse}") String interestedCourse,@Value("${student.interestedGame}") String interestedGames) {
        this.name = name;
        this.interestedCourse = interestedCourse;
        this.interestedGames = interestedGames;
        System.out.println("constructor invoked");
    }

    public String getName() {
        return name;
    }
    //@Value("${student.name}")
    public void setName(String name) {
        this.name = name;
        System.out.println(" Setter method executed - name filed set ");
    }
    public String getInterestedCourse() {
        return interestedCourse;
    }


    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public String getInterestedGames() {
        return interestedGames;
    }
    @Value("${student.interestedGame}")
    public void setInterestedGames(String interestedGames) {
        this.interestedGames = interestedGames;
    }

    public void display() {
        System.out.println(
                "name='" + name + '\'' +
                        ", interestedCourse='" + interestedCourse + '\'' +
                        ", interestedGames='" + interestedGames + '\'');
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", interestedCourse='" + interestedCourse + '\'' +
                ", interestedGames='" + interestedGames + '\'' +
                '}';
    }
}
