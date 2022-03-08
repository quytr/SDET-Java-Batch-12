package com.replit.hw;

public class VariablesInJava125 {
    /*
Declare a static variable number that will hold an integer value:

Access number from the main method and assign value to it.

Create an Object of the class, access number in a nonstatic way and assing value of 200.

Print out number using class name and using instance
     */

    static int number;

    public static void main(String[] args) {

        VariablesInJava125 obj = new VariablesInJava125();
        obj.number = 200;

        System.out.println(number);
        System.out.println(VariablesInJava125.number);


    }
}
