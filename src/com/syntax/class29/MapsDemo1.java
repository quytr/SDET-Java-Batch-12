package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin B");
        names.add("Tracy");
        System.out.println(names);
        System.out.println(names.get(0));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(123456789, "Kevin B");
        map.put(123456, "Tracy");
        System.out.println(map);
        System.out.println(map.get(123456));
        System.out.println(map.get(123456789));

        HashMap<String, String> groceries = new HashMap<>();
        groceries.put("Lilly", "Eggs, milk, bread");
        groceries.put("Teyfur", "Camel, Horse, CamelHorse");
        groceries.put("Asghar", "MacBook, Iphone 13, Apple Monitor Stand");
        System.out.println(groceries.get("Lilly"));
    }
}
