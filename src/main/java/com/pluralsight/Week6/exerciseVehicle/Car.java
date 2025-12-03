package com.pluralsight.Week6.exerciseVehicle;

public class Car extends Vehicle{

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void beepBeep() {
        System.out.println("beep beep");
    }
}
