package org.example;


// POJO
public class Vehicle {

    private String vehicle;
    private int weight;

    public Vehicle(String vehicle, int weight) {
        this.setVehicle(vehicle);
        this.setWeight(weight);
    }

    public Vehicle() {
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getData() {
        return ("Vehicle type: " + vehicle + "\nCarriage: " + weight);
    }
}
