package com.syntax.class30;

import java.util.HashMap;

public class Task1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main(String[] args) {
        HashMap<Integer, String> buildings = new HashMap<>();
        buildings.put(1, "Google");
        buildings.put(2, "Syntax");
        buildings.put(3, "Apple");
        buildings.put(4, "Tesla");
        buildings.put(5, "Microsoft");
        buildings.put(5, "Samsung");
        buildings.put(6, "Google");
        buildings.put(7, "Samsung");

        System.out.println(buildings);
        System.out.println("Entries: " +buildings.size());
        buildings.replace(4,"Amazon");  //update the value
        buildings.remove(7);
        System.out.println(buildings);

    }
}
