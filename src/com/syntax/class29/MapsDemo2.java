package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Orange", 10);
        fruits.put("Apple", 1000);
        fruits.put("Banana", 15);

        Map<String, Integer> vegetables = new HashMap<>();
        vegetables.put("potato", 12);
        vegetables.put("tomato", 10);

        Map<String, Integer> groceries = new HashMap<>();
        groceries.putAll(fruits);
    }
}
