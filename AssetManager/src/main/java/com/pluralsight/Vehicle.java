package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vehicle extends Asset {

    // Properties of this class
    private String makeModel;
    private int year;
    private int odometer;


    //Methods: constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }

// Generate getter and setter

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
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

    //getValue() : double (override)
    @Override
    public double getValue() {
        // know the currentYear = localDate.now.getYear() - year ; => age currentYear - this.year;
        int currentYear = LocalDate.now().getYear();
        int theCarYear = currentYear - this.year;
        double value;

        if (theCarYear >= 0 && theCarYear <= 3) {
            value = this.originalCost - (this.originalCost * 0.03 * theCarYear);// reduce 3% from originalCost.
        } else if (theCarYear >= 4 && theCarYear <= 6) {
            value = this.originalCost - (this.originalCost * 0.06 * theCarYear); // reduce 6% per year from originalCost.
        } else if (theCarYear >= 7 && theCarYear <= 10) {
            value = this.originalCost - (this.originalCost * 0.08 * theCarYear); // reduce 8% per year from originalCost.
        } else { // over 10 years old value of the care is
            value = 1000.00;
        }
        if (this.odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value -= value * 0.25; // reduce by 25% from original cost.
        }
        return value;

    }

    @Override
    public String toString() {
        return ", Make/Model: " + makeModel +
                ", Year: " + year ;
    }
}
