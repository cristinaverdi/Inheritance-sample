package com.cristinaverdi.inheritance;

public class Main {
    public static void main(String[] args) {


        Machine fridge = new Fridge();
        Machine oven = new Oven();

        fridge.turnOn();
        oven.turnOn();
    }
}