package com.kp.learnspring;

public class Subject {

    private String id;
    private String name;

    private String staff;

    public Subject(String id, String name, String staff) {
        this.id = id;
        this.name = name;
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", staff='" + staff + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }
}
