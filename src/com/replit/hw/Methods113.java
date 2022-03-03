package com.replit.hw;

public class Methods113 {
    /*
Step1: Create a method that will accept with 2 parameters of integer type

Step2: Write the logic in that method in println statement to print hours and minutes

Step3: Call the method
     */

    void printTime(int hours, int minutes){
        System.out.println(hours+":"+minutes);
    }

    public static void main(String[] args) {
        Methods113 obj = new Methods113();
        obj.printTime(11,30);
    }
}
