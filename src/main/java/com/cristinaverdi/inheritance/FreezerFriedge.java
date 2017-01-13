package com.cristinaverdi.inheritance;


public class FreezerFriedge extends Fridge {


    @Override //indica al programador que estás sobreescribiendo un método que está en una clase padre
    public void turnOn() {
        System.out.println("Freezer is on");
    }


    void unfreeze() {
        System.out.println("Unfreezing");
    }
}
