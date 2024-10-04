package com.kplearn.spring_core_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeBean") // this line commented as i'm using @Bean in config class there is a method which return bean
public class Employee {

    @Value("${employee.name}")
    private String name;
    private String age;
    @Autowired(required = true)
    private Department department;

    @Autowired
    @Qualifier("bajaj") // When we have two objects of same implement which one is resolved ? so Quantifier will allow to set one of implementation type. Although @Primary is set for reliance implement class , qualifier will override.
    private Insurance insurance;

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Employee() {
    }

    // constructor autowire
    public Employee(Department department) {
        this.department = department;
        System.out.println("constructor invoked");
    }

    // @Required --> Deprecated, instead use constructor to set mandatory field/ reference .
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void test() {
        System.out.println("inside employee class test() ");
    }

    public Department getDepartment() {
        return department;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setDepartment(Department department) {
        this.department = department;
        System.out.println("setter invoked");
    }

    public String getName() {
        return name;
    }
}
