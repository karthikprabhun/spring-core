package com.kp.learn.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        System.out.println(" Simple assignment on Loosely Coupling using Spring ");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Airtel airtel = applicationContext.getBean("airtel",Airtel.class);
        System.out.println("Phone number : "+airtel.getNumber()+ " activated with ");airtel.activateService();
    }
}
