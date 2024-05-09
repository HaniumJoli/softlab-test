package com.arf.myapplication;

public class sedan extends Vehicle{
    public sedan() {
        super(4);
    }

    @Override
    public void drive() {
        if(getFuel() <2) {
            throw new IllegalStateException("Not enough fuel");
        }
        else{
            setFuel(getFuel()-2);
            setMilage(getMilage()+5);
            System.out.println("Driving sedan");
        }
    }
}
