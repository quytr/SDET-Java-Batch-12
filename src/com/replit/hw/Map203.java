package com.replit.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map203 {
    /*
Create HashMap

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

map.put("mango", 40);

map.put("mango", 40);

Using iterator retrieve all keys and values if the format below:

Expected Output:

Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
     */
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("mango", 10);
        fruits.put("apple", 30);
        fruits.put("orange", 20);
        fruits.put("mango", 40);
        fruits.put("mango", 40);

        Iterator<Map.Entry<String, Integer>> iterator = fruits.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();;
            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
        }

    }
}
