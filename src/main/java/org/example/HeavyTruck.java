package org.example;

public class HeavyTruck extends Vehicle {

    public HeavyTruck(String vehicle, int weight) {
        super(vehicle, weight);
    }

    @Override
    public String getData() {
        String s = super.getData();
        return s + " ";
    }
}
