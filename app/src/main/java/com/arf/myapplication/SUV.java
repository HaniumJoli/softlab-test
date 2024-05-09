package com.arf.myapplication;

public class SUV extends Vehicle{
    public SUV() {
        super(4);
    }

    @Override
    public void drive() {
        if(getFuel() <2.5) {
            throw new IllegalStateException("Not enough fuel");
        }
        else{
            setFuel(getFuel()-2.5);
            setMilage(getMilage()+4);
            System.out.println("Driving SUV");
        }
    }
}
