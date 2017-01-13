package com.cristinaverdi.inheritance;


public class TV  implements Machine {

    @Override
    public void turnOn() {
        System.out.println("Tv is on!");
    }
}
