package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //arrayList of Asset object => vacation home and 2 vehicles  /myHouse,bilenieSuv

        //loop through the list display (description of the object(  I will use toString method => date acquired, price we paid, value of the vehicle & the house )
        // Then loop through again the list & display (description of the object(  I will use toString method => address of house, year & make/mode of car.)
        // to identify the type of asset to know it its house or vehicle do instanceOf when looping => after knowing the type call a method of type(house / vehicle )
/*
can call the methods of the specific type.
3-20
Example
String message = "";
if (myAssets.get(i) instanceof House) {
House house = (House) myAssets.get(i);
message = "House at " + house.getAddress();
}
else if (myAssets.get(i) instanceof Vehicle) {
Vehicle vehicle = (Vehicle) myAssets.get(i);
message = "Vehicle: " +
vehicle.getYear() + " " + vehicle.getMakeModel();
}*/
    }
}
