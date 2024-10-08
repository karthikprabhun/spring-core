package com.kp.spring.learn_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autowire_FiledInjection_UserService {


    @Autowired
    private UserRepository userRepository; // Field injection

    public void performAction() {
        // Use userRepository
        userRepository.toString();
    }
}


