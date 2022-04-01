package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HW5 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Kansas City");
        cities.add("Arlington");
        cities.add("Sterling");
        cities.add("Reston");
        cities.add("Aurora");

        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);


    }
}
