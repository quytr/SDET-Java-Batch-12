package com.syntax.class16;

import java.util.Arrays;

public class StringTask6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping str1 = " + str1 + " and str2 = " + str2);

        str1= str1.concat(" " + str2);
        String[] swapStr = str1.split(" ");

        str1 = swapStr[swapStr.length -1];
        str2= swapStr[0];

        System.out.println("After swapping str1 = "+ str1 + " and str2 = " + str2);

    }
}
