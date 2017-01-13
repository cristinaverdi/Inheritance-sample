package com.cristinaverdi.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Machine fridge = new Fridge();
        Machine oven = new Oven();
        Machine fridge2 = new Fridge();
        Machine oven2 = new Oven();

        Fridge freezer = new FreezerFriedge();
        freezer.turnOn();
        freezer.turnLightOn();
        freezer.turnLightOn();

        //oven.increaseTemp(20);

        List<Machine> list = new ArrayList<>();
        list.add(oven);
        list.add(fridge);
        list.add(oven2);
        list.add(fridge2);
        list.add(freezer);
        list.add(new TV());


        turnMachinesOn(list);

        /**
         * turns on all the given machines
         */


    }

    static void turnMachinesOn( List<Machine> machines ) {

        machines.forEach(m -> m.turnOn());
    }
}


