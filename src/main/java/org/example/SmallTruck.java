package org.example;

public class SmallTruck extends Vehicle {

    public SmallTruck(String vehicle, int weight) {
        super(vehicle, weight);
    }

    @Override
    public String getData() {
        String s = super.getData();
        return s + " ";
    }
}
