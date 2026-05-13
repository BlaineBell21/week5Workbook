package com.pluralsight.model;

import java.util.Objects;

public class Vehicle extends Asset{
    private String vehicleModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double calculateYearCost(double depreciation){
        double vehicleCost = getOriginalCost();

        double reducedCost = vehicleCost * depreciation;
        double currentValue = vehicleCost - reducedCost;
        System.out.println(currentValue);
        return currentValue;
    }

    @Override
    public double getValue(){// A car's value is determined as

        double totalAssetValue = 0;
        int vehicleYears = getYear();

        if(vehicleYears >= 0 && vehicleYears <= 3){
            totalAssetValue += calculateYearCost(.03);
        } else if(vehicleYears >= 4 && vehicleYears <= 6){
            totalAssetValue += calculateYearCost(.06);
        }  else if(vehicleYears >= 7 && vehicleYears <= 10){
            totalAssetValue += calculateYearCost(.08);
        } else if (vehicleYears > 10) {
            totalAssetValue += getOriginalCost() - 1000;
        }

        String vehicleModel = getVehicleModel();
        int vehicleMiles = getOdometer();

        if ((!Objects.equals(vehicleModel, "Honda") && !Objects.equals(vehicleModel, "Toyota") && vehicleMiles > 100000)) {
           totalAssetValue += calculateYearCost(.25);
            // MINUS reduce final value by 25% if over 100,000 miles
        }

        return totalAssetValue;
    }
}
