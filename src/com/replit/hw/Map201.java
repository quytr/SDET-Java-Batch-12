package com.replit.hw;

import java.util.HashMap;

public class Map201 {
    /*
Create a Map in which you do not need to preserve the order of the entries

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Find how many entries are inside the map

Remove all entires from the Map

Find the Map size again

Expected Output:

5
0
     */
    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("Street","Patrick ST");
        maps.put("Suite","265");
        maps.put("City","Vienna");
        maps.put("Zip","22180");
        maps.put("Country","United States");

        System.out.println(maps.size());
        maps.clear();
        System.out.println(maps.size());
    }
}
