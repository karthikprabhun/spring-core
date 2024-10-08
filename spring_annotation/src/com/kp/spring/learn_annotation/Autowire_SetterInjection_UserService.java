package com.kp.spring.learn_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autowire_SetterInjection_UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) { // Setter injection
        this.userRepository = userRepository;
    }

    public void performAction() {
        // Use userRepository
    }
}


