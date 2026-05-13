package com.pluralsight;

import com.pluralsight.model.House;
import com.pluralsight.model.Vehicle;

public class Main {
    static void main(String[] args) {
        Vehicle v1 = new Vehicle("Hybrid power meets confident control", "5/12/2026", 42000);
        House h1 = new House("house", "5/12/2026", 900000);
        h1.getOriginalCost();
        h1.getValue();
    }
}
