package com.syntax.class16;

import java.util.Arrays;

public class StringTask1 {

    public static void main(String[] args) {

        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String str = "Java is giving me headache";
        System.out.println(str);
        String newStr = str.replace(" ", "");
        System.out.println(newStr);


    }
}
