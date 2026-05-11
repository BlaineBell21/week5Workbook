package com.pluralsight.model;

public class Moped extends Vehicle{
    public Moped(String color, String vehicleBrand, String vehicleModel, int numberOfPassengers, int fuelCapacity){ //constructor for the moped
        super(color, vehicleBrand, vehicleModel, numberOfPassengers, fuelCapacity); //super constructor that calls the parent class' constructor

    }
}
