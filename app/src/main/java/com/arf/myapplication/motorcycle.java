package com.arf.myapplication;

public class motorcycle extends Vehicle{
    public motorcycle() {
        super(2);
    }

    @Override
    public void drive() {
        if(getFuel() <0.5) {
            throw new IllegalStateException("Not enough fuel");
        }
        else{
            setFuel(getFuel()-0.5);
            setMilage(getMilage()+1.5);
            System.out.println("Driving motorcycle");
        }
    }
}
