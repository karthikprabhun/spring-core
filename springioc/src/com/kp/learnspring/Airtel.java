package com.kp.learnspring;

public class Airtel implements Sim {
    @Override
    public void calling() {
        System.out.println("calling via airtel sim card");
    }

    @Override
    public void data() {
        System.out.println("surfing internet using airtel sim car");
    }
}
