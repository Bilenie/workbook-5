package com.pluralsight;

public class House extends Asset {
    //Properties: address : String
    private String address;
    private int condition; //(1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;


    //Methods: constructor
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squarefoot, int lotSize) { //remove if not needed

        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squarefoot;
        this.lotSize = lotSize;
    }


    // Generate getter and setter for this class attribute.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;//Generate a constructor that specific to this class properties
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    //@override getValue method
    @Override
    public double getValue() {
        double price;
        switch (this.condition) {
            case 1://excellent
                price = 180.0;
                break;
            case 2:// good
                price = 130.0;
                break;
            case 3://fair
                price = 90.0;
                break;
            default://poor
                price = 80.0;
        }
        return (this.squareFoot * price) + (this.lotSize * 0.25);// PLUS 25 cents per square foot of lot size

    }

    @Override
    public String toString() {
        return super.toString() + ", Address: " + address;
    }
}
