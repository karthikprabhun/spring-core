package com.kp.learnspring;

public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("calling via jio sim card");
    }

    @Override
    public void data() {
        System.out.println("surfing internet using jio sim car");
    }
}
