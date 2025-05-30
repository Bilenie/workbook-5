package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        //create an arrayList to contain our Asset object => Houses and vehicles.
        ArrayList<Asset> assets = new ArrayList<>();//Asset is there because we want the list to contain the children.
//(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer)
        assets.add(new Vehicle("My Rav4 Car", "01/02/2025", 47000.00, "Toyota", 2025, 7000));
        assets.add(new Vehicle("My Second Car", "04/05/2024", 35000.00, "Honda", 2024, 100000));

//(String description, String dateAcquired, double originalCost, String address, int condition, int square foot, int lotSize)
        assets.add(new House("My Primary House", "12/30/2025", 200000.0, "Garland Texas", 1, 2000, 5000));
        assets.add(new House("My Vacation House", "12/30/2028", 200500.0, "South Lake Texas", 2, 1500, 4000));

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        //loop through the list display (description of the object(  I will use toString method => date acquired, price we paid, value of the vehicle & the house )
        for (int i = 0; i < assets.size(); i++) {
            Asset myAssets = assets.get(i);
            String timeNow = LocalTime.now().format(timeFormat);

            System.out.println("\n[" + timeNow + "] **********************************************************");
            System.out.println(myAssets);
            System.out.println("**********************************************************");

            pause();

        }
        // Then loop through again the list & display (description of the object(  I will use toString method => address of house, year & make/mode of car.)
        // to identify the type of asset to know it its house or vehicle do instanceOf when looping => after knowing the type call a method of type(house / vehicle )
        for (int i = 0; i < assets.size(); i++) {
            Asset myAssets = assets.get(i);

            System.out.println("**********************************************************");

            if (myAssets instanceof House) {
                House house = (House) myAssets;
                System.out.println("House at: " + house.toString());
                System.out.println("**********************************************************");

            } else if (myAssets instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets;
                System.out.println("Vehicle: " + vehicle.toString());
            }

            pause();

        }

    }
//Asset myAsset =  new Asset(); => was throwing error

    public static void pause() {
        try {
            Thread.sleep(2000); // Wait 2 seconds before showing the next
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }
}
