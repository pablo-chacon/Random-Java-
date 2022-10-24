package org.example;

import org.example.Vehicle;

public class Van extends Vehicle {

    public Van(String vehicle, int weight) {
        super(vehicle, weight);
    }

    @Override
    public String getData() {
        String s = super.getData();
        return s + " ";
    }
}
