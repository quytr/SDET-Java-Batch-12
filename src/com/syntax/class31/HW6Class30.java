package com.syntax.class31;

import java.util.LinkedHashSet;


public class HW6Class30 {
    /*
   Create the collection that will store single uniques Objects of a String type in which order is preserved.
   Write a logic to concatenate all string from the collection.
    */
    public static void main(String[] args) {
        LinkedHashSet<String> objects = new LinkedHashSet<>();
        objects.add("Java");
        objects.add("is");
        objects.add("SUPER");
        objects.add("fun");

        StringBuilder str = new StringBuilder();
        for(String obj : objects){
            str.append(obj).append(" ");
        }
        System.out.println(str);
    }
}
