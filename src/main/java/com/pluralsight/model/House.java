package com.pluralsight.model;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFeet;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){

        double totalAssetValue = getOriginalCost();
        //int houseCondition = 4;
        switch (3) {
            case 1:
                totalAssetValue += 180;
                break;
            case 2:
                totalAssetValue += 130;
                break;
            case 3:
                totalAssetValue += 90;
                break;
            case 4:
                totalAssetValue += 80;
                break;
            default:
                System.out.println("Invalid input");
        }
        int squareFootage = getLotSize();

        totalAssetValue += squareFootage * .25;

        System.out.println(totalAssetValue);
        return totalAssetValue;
    }
}
