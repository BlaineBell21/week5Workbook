package com.pluralsight;

import com.pluralsight.model.Car;
import com.pluralsight.model.Hovercraft;
import com.pluralsight.model.Moped;
import com.pluralsight.model.SemiTruck;
//public Moped(String color, String vehicleBrand, String vehicleModel, int numberOfPassengers, int fuelCapacity){
//        super(color, vehicleBrand, vehicleModel, numberOfPassengers, fuelCapacity);
//    }
public class Main {
    static void main(String[] args) {
        Moped m1 = new Moped("Black", "Yamaha", "2026 Zuma 125", 2, (int) 1.6);

        Car c1 = new Car("Black", "Chevorolet", "Bolt EV LT", 5, 0);

        SemiTruck s1 = new SemiTruck("White", "Volvo", "2023 Volvo VNL64860", 2, 240);

        Hovercraft h1 = new Hovercraft("White", "Hoverwork", "Griffon Hoverwork 2000TD", 3, 2000);

        h1.getColor();
        m1.getVehicleBrand();
        c1.getNumberOfPassengers();
        s1.getVehicleModel();

    }

}
