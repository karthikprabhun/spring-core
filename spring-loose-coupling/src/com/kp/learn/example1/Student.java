package com.kp.learn.example1;

public class Student {

    private String name;
    private int age;
    private Cheat cheat; // interface reference over class reference to avoid hard coding

    public Student(String name, int age, Cheat cheat) {
        this.name = name;
        this.age = age;
        this.cheat = cheat;
    }

    public Student() {
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

    public Cheat getCheat() {
        return cheat;
    }

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }


}
