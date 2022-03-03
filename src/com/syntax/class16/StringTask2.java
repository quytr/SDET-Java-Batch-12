package com.syntax.class16;

import java.util.Arrays;

public class StringTask2 {
    public static void main(String[] args) {

        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        //How would you find out how many sentences are in that String?
        String b = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] arr = b.split("[?]");
        System.out.println(Arrays.toString(arr));
        System.out.println("There are " + arr.length + " sentences");
    }
}
