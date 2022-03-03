package com.syntax.class16;

public class StringTask3 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.
        String a = "A string: QYHJ 123 @#%^$)_%)";
        String newA = a.replaceAll("[^a-zA-Z0-9@#]","");
        System.out.println(newA);
        System.out.println("There are " + newA.length()+ " Alphanumeric characters");
    }
}
