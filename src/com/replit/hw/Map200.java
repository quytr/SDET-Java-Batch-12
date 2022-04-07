package com.replit.hw;

import java.util.LinkedHashMap;

public class Map200 {
    /*
Create A Map that will preserve an order of entry objects

Add below pairs :

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values of from the map

Expected Output:

Patrick ST
265
Vienna
22180
United State
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> maps = new LinkedHashMap<>();
        maps.put("Street", "Patrick ST");
        maps.put("Suite", "265");
        maps.put("City", "Vienna");
        maps.put("Zip", "22180");
        maps.put("Country", "United State");

         for(String values: maps.values()){
             System.out.println(values);
         }

    }
}
