package com.syntax.class30;

import java.util.LinkedList;

public class HW6 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        LinkedList<String> objects = new LinkedList<>();
        objects.add("Java");
        objects.add("is");
        objects.add("SUPER");
        objects.add("fun");

        String str = String.join(" ", objects);
        System.out.println(str);


    }
}
