package com.syntax.class28;

import java.util.ArrayList;

public class Task3 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Coffee");
        drinks.add("Oranges juice");
        drinks.add("Milk");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e") || drinks.get(i).contains("e")){
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
