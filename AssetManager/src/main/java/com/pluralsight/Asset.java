package com.pluralsight;

public class Asset {

//set the properties of the asset base class

    protected String description;
    protected String dateAcquired;
    protected double originalCost;


//Generate constructor

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //custom method for getValue() // return original cost and its double
    public double getValue() {
        return originalCost;
    }

//Generate getter and setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    @Override
    public String toString() {
        return "Description: " + description +
                ", Date Acquired: " + dateAcquired +
                ", Original Cost: $" + originalCost + " value : " + getValue();
    }
}
