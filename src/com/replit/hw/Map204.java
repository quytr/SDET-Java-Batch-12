package com.replit.hw;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map204 {
    /*
Create a Map that will preserve an order of entry objects

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values using iterator

Expected output:

Patrick ST
265
Vienna
22180
United State
     */

    public static void main(String[] args) {
        LinkedHashMap<String, String> maps = new LinkedHashMap<>();
        maps.put("Street","Patrick ST");
        maps.put("Suite","265");
        maps.put("City","Vienna");
        maps.put("Zip","22180");
        maps.put("Country","United State");

        Iterator<Map.Entry<String, String>> iterator = maps.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }
    }
}















