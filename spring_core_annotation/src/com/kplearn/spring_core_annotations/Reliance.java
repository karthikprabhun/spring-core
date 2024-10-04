package com.kplearn.spring_core_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // As we have multiple implementation, this one will be used a primary.
public class Reliance implements Insurance{
    @Override
    public void sumAmount() {
        System.out.println("INR : 2L");
    }
}
