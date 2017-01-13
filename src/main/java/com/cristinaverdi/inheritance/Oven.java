package com.cristinaverdi.inheritance;


public class Oven implements Machine {
    private int temperature;

    public Oven(){
        this.temperature = 0;
    }

   public void turnOn() {
        System.out.println("oven is on");
    }

    public void increaseTemp(int inc) {
        temperature += inc;
    }
}
