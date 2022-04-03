package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Vietnam", "Ho Chi Minh City");
        countries.put("England", "London");
        countries.put("Spain", "Marid");
        countries.put("Canada", "Ottawa");

        System.out.println(countries);

        for(Map.Entry<String, String> country : countries.entrySet()){
            System.out.println(country);
            System.out.println(country.getValue());
            System.out.println(country.getKey());
        }

        System.out.println("*********************************************");

        Iterator<Map.Entry<String,String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> i = iterator.next();
            System.out.println(i);
            System.out.println(i.getValue());
            System.out.println(i.getKey());

        }

        System.out.println("*****************************************************");

        for(String value : countries.values()){
            System.out.println(value);
        }

        System.out.println("*****************************************************");

        Iterator<String> iterator1 = countries.values().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
