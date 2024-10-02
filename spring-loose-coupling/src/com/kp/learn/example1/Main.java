package com.kp.learn.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Spring Loose coupling example");


        Student student = new Student("ashwini",31,new EnglishCheat());

        student.getCheat().cheating();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");

        Student student2 = applicationContext.getBean("student1",Student.class);
        System.out.print(student2.getName() +" ");student2.getCheat().cheating();


    }
}