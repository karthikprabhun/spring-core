package com.kp.spring.learn_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Spring @Annotation Demo");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Human human = applicationContext.getBean("human",Human.class);

        human.getHeartStatus();

    }
}