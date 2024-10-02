package com.kp.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        /* Welcome to Spring Framework
           Concepts - Inversion of control (IoC) , Dependency Injection , Aspect Oriented Programing (AOP) etc
         */

        /* Without Spring or framework
           - Application creates, manages object / bean
           -
         */

        /* With the help of Spring framework
           - Application no more create objects/ beans
           -
         */

        // Demo to understand without framework

        // Here Objects are instantiated by application not framework
        Airtel airtel = new Airtel();
        Vodafone vodafone = new Vodafone();

        // Although the approach is better than predecessor but still managed by application not framework
        Sim airtel2 = new Airtel();

        /* Thought - What if object/ bean creation, manage is taken care by framework instead application ?
           That's where framework like spring come in to picture which makes developer life easy

         */

        // Let's do in Spring way. Note : i'm not using SB, so jar have to be added manually.
        //Inversion of control (IoC) - creates objects for us, managing objects, helps application to be configurable, managing dependency
        // application context creates container and refer config file where class are defined for bean creation.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml"); // there are other implementations one can explore
        System.out.println("Config loaded");

        Sim sim = applicationContext.getBean("sim", Sim.class); // fetch given bean from the container
        sim.calling();
        sim.data();

        /* Additional Information
            Advantages of using framework ? makes developers life easy
            2 types of Container - BeanFactory ( basic ) & ApplicationContext ( advanced one and mostly used )
            Due to IoC we are not creating objects manually and no changes are need in the class level instead do it in config file
         */

        /* --------------------------------------------------------- Dependency Injection ------------------------------------------------------------------------------------*/
        System.out.println("--------------Dependency Injection---------------");
        /* Spring DI injects dependency on behalf of application itself.
        For example consider a class named Person which has fields like name, home no., Family , Job, Address etc.
        All these  dependencies are resolved by spring instead we hardcoding the values and reference in the class level.
        Dependencies in the form of literals (ex: name ), objects (ex: Family),collections (Ex: ArrayList<Address>)
        Spring facilities us to set values and reference using constructor or setter.
         */

        // What is wrong with below approach ? com.kp.learn.Student object is tightly coupled with Exam object & Application itself is providing the dependency.
        System.out.println("DI without Spring");
        Student student1 = new Student("karthik",15,"bengaluru"); // Let spring do this
        Student student2 = new Student("visual",12,"mangalore"); // Let spring do this
        Student student3 = new Student("koushik",11,"mysore"); // Let spring do this

        Exam exam = new Exam("Mid Trimester"); // Let spring do this
        exam.addStudent(student1); // Let spring do this
        exam.addStudent(student2);
        exam.addStudent(student3);

        System.out.println("Display student eligible to take exam");
        exam.getAllStudent();

        // Let's spring inject dependency instead we doing it manually. Internally, framework will handle all dependency resolve as defined in config file.

        System.out.println("DI by Spring framework. Have a look at config file to understand the bean configuration");
        Exam exam1 = applicationContext.getBean("exam1", Exam.class);
        System.out.println(exam1.getTitle());
        exam1.getAllStudent();
        System.out.println(exam1.getSubject().toString());


        Exam exam2 = applicationContext.getBean("exam2", Exam.class);
        System.out.println(exam2.getTitle());
        exam2.getAllStudent();





    }
}