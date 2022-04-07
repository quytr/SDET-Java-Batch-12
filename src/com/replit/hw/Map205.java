package com.replit.hw;

import java.util.HashMap;
import java.util.Map;

public class Map205 {
    /*
 Create a HashMap of String.

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all the values in upper case using entrySet

Expected Output:

265
22180
PATRICK ST
UNITED STATE
VIENNA
     */

    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("Street","Patrick ST");
        maps.put("Suite","265");
        maps.put("City","Vienna");
        maps.put("Zip","22180");
        maps.put("Country","United State");

        for(Map.Entry<String, String> map: maps.entrySet()){
            System.out.println(map.getValue().toUpperCase());
        }

    }
}
