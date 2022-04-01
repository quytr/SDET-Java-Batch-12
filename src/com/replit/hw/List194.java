package com.replit.hw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List194 {
    /*
    For you to do:

Create a method that will remove an element based on the specified condition from given List and return new List;

Expected Output:

[USA, Kazakhstan, Pakistan, Russia]
     */

    public static boolean removeElement(String str){
        return str.startsWith("A")? true: false;
    }
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Iterator<String> iterator = countries.iterator();
        while(iterator.hasNext()){
            if(removeElement(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println(countries);


    }
}
