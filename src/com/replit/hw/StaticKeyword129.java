package com.replit.hw;

public class StaticKeyword129 {
    /*
Declare two static variables to hold

country name
continent
Create a method to display the value of static variables in the following format:

____ located on ____ continent

In the main method assign values to a static variable and execute method display
     */

    static String countryName;
    static String continent;

    static void printAll(){
        System.out.println(countryName + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        countryName = "Morocco";
        continent = "Africa";
        printAll();
    }

}
