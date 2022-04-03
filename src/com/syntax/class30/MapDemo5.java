package com.syntax.class30;


import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);

        //entry.Set() is a box, inside we have box with key and value;
        System.out.println(fruitMap.entrySet());  // entrySet() is a method that return an object
        // getting the entries aka small boxes that contains the keys and values together
        for(Map.Entry<String, Double> entry : fruitMap.entrySet() ){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
