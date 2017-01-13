package com.cristinaverdi.inheritance;


public class Fridge implements Machine {


    public void turnOn() {
        System.out.println("Fridge is On");
    }

    void turnLightOn() {
        System.out.println("Light turned on");
    }
}
