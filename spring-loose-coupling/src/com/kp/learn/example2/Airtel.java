package com.kp.learn.example2;

public class Airtel {

    private Services services;

    private long number;

    public Airtel(Services services, long number) {
        this.services = services;
        this.number = number;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void activateService(){
        services.service();
    }
}
