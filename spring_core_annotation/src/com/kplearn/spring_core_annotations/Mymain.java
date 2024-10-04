package com.kplearn.spring_core_annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mymain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(configClass.class);
        System.out.println("beans config loaded");
       /* College college = applicationContext.getBean("collegeBean", College.class);
        System.out.println("College object created by spring is : " + college);
        college.test();*/


       Employee employee = applicationContext.getBean("employeeBean", Employee.class);

        employee.test();
        System.out.println(employee.getName());
        employee.getDepartment().test();
        employee.getInsurance().sumAmount();


    }
}
