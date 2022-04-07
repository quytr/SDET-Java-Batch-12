package com.replit.hw;

import java.util.HashMap;
import java.util.Map;

public class Map208 {
    /*
    Create a Method in Main class using below specification.

Method Name: Display.

Return Type: Void

Parameters : Map<String,Integer>

Logic:

First the method will check the given map is empty or not.

If the map is not empty print pairs of key and value using loops

If map is empty simply print "map is empty"

NOW IN MAIN METHOD

Create HashMap of String keys and Integer values

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

using created display method to display.

then clear the map.

use the same method to display
     */
    public static void Display(Map<String, Integer> maps){
        if(maps.isEmpty()){
            System.out.println("map is empty");
        }else{
            for(Map.Entry<String, Integer> map : maps.entrySet()){
                System.out.println(map.getKey() + " : " + map.getValue());
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("mango", 10);
        fruits.put("apple", 30);
        fruits.put("orange", 20);

        Display(fruits);

        fruits.clear();

        Display(fruits);

    }
}
