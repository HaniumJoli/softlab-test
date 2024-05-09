package com.arf.myapplication;

public abstract class Vehicle {
    private int wheel;
    private double fuel;
    private double milage;
    public Vehicle(int wheel) {
        this.wheel = wheel;
        this.fuel = 0;
        this.milage = 0;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }
    public void addFuel(double fuel){
        this.fuel += fuel;
    }
    public abstract void drive();
}
