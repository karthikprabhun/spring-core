package com.kplearn.spring_core_annotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
    private String name;
    private String location;

   /* private List<Course> courses;

    private List<Student> student;*/

    public void test(){
        System.out.println("Inside college bean test() ");
    }
}
