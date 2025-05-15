package com.pluralsight;

public class Cash extends Asset {
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
//This was erroring prompting us to add override method.
    @Override
    public double getValue() {
        return 0;//originalCOST
    }
}
