package com.kplearn.spring_core_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.kplearn.spring_core_annotations"})
@PropertySource("classpath:employee-info.properties")
public class configClass {

    /* As already aware there are two approachs to create or register bean in spring container,
    one by @Bean in config class like below
                    or
    by marking all classes, and it's dependency with @Component.
    But the 2nd approach works only when @Autowire is used in the parent class. Refer Employee class.
    However, configClass marked with @Configuration and @ComponentScan are also need for 2nd approach to work.
     */

   /* @Bean("insuranceBean")
    public Insurance insuranceBean(){
        return new Reliance();
    }

    @Bean("departmentBean")
    public Department departmentBean(){
        return  new Department();
    }

    @Bean("employeeBean")
    public Employee employeeBean(){
        // return new Employee(departmentBean()); // constructor injection

        // setter injection
        Employee employee = new Employee();
        employee.setDepartment(departmentBean());
        employee.setInsurance(insuranceBean());
        return employee;

        //return new Employee(); // DI by Type
    }*/




}
