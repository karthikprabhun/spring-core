package com.kp.learnspring;

public class Vodafone implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling using vodafone sim card");
    }

    @Override
    public void data() {
        System.out.println("Surfing internet using vodafone sim card");
    }
}
