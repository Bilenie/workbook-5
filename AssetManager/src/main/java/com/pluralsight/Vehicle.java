package com.pluralsight;

public class Vehicle extends Asset {

    // Properties of this class
    private String makeModel;
    private int year;
    private int odometer;


    //Methods: constructor
    public Vehicle(String description, String dateAcquired, double originalCost,String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }

    //getValue() : double (override)
    @Override
    public double getValue() {
/*
// A car's value is determined as > list of cars
// 0-3 years old - 3% reduced value of cost per year => if(year of vehicle >= 0 && vehicle year is <=3) value* 3%=>0.03)
// 4-6 years old - 6% reduced value of cost per year => else if(year of vehicle >= 4 && vehicle year is <=6) value* 6%=>0.06)
// 7-10 years old - 8% reduced value of cost per year => else if(year of vehicle >= 7 && vehicle year is <=10) value* 8%=>0.08)
// over 10 years old - $1000.00 => else if( year of vehicle > 10) value  = 1000
// MINUS reduce final value by 25% if over 100,000 miles= initialize miles to 0; and condition add  if (miles == 100,000){final value  = value * 0.25 if miles = 100,000}
// unless makeModel contains word Honda or Toyota => list with a key honda or toyota = > loop and get vehicle that the key matches honda and toyota but list need to contain that */

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




}
