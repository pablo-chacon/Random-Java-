package org.example;


import java.util.HashMap;

public class Lanes {

    public String lane;
    public Vehicle vehicle;
    public int weight;
    public boolean isAvailable;
    public int weightLimits;


    public Lanes(String lane, Vehicle vehicle, int weight) {
        this.setLane(lane);
        this.setVehicle(vehicle);
        this.setWeight(weight);
        isAvailable = false;
    }

    public Lanes(HashMap<String, String> lane, String weight){};


    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isAvailable = false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void goToLane(Vehicle v) {
        vehicle = v;
        isAvailable = false;
    }

    public void dumpDone() {
        vehicle = null;
        isAvailable = true;
    }

    public String getStatus() {
        if (isAvailable) {
            return "Proceed to lane: " + lane;
        } else {
            return "No lanes currently available.";
        }
    }

    public String toString() {
        return "Lane: " + lane + "\nVehicle: " + vehicle + "\n Weight: " + weight;
    }
}
