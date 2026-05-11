package com.pluralsight.model;

public class Vehicle {
    private String color;
    private String vehicleBrand;
    private String vehicleModel;
    private int numberOfPassengers;
    private int fuelCapacity;

    public Vehicle(String color, String vehicleBrand, String vehicleModel, int numberOfPassengers, int fuelCapacity) {
        this.color = color;
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.numberOfPassengers = numberOfPassengers;
        this.fuelCapacity = fuelCapacity;
    }

    public void getColor() {
        System.out.println("The color of this vehicle is " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getVehicleBrand() {
        System.out.println("The brand of this vehicle is " + vehicleBrand);
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public void getVehicleModel() {
        System.out.println("The model of this vehicle is " + vehicleModel);
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void getNumberOfPassengers() {
        System.out.println("This vehicle can hold " + numberOfPassengers + " passenger(s)");
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
