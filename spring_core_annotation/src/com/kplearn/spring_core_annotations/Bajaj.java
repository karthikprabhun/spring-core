package com.kplearn.spring_core_annotations;

import org.springframework.stereotype.Component;

@Component
public class Bajaj implements Insurance{
    @Override
    public void sumAmount() {
        System.out.println(" Sum amount insured is 1.5L");
    }
}
