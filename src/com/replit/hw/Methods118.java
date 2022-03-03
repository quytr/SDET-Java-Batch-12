package com.replit.hw;

public class Methods118 {
    /*
Write a method header on line two with the following specs:

Returns:
a String

Name:
spaceOut

Parameters:
a String

Then complete the method by programming the following behavior

Insert spaces after every character in the String s, then return the new string.

     */

    String spaceOut(String input){
        String newInput = null;
        for (int i = 0; i < input.length() ; i++) {
            System.out.print(input.charAt(i) + " ");
        }
        System.out.println();
        return input;
    }

    public static void main(String[] args) {
        Methods118 obj = new Methods118();
        obj.spaceOut("hello");
        obj.spaceOut("technology");
    }
}
