package com.replit.hw;

public class VariablesInJava120 {
    /*
Declare 3 instance variables to hold:

year, school name and batch #

Access variables from the main method and assign specific values to them

Print values of your variables in the following format:

Expected Output:

I am a student of batch 9 studying at Syntax in the year of 2021
     */

    int year;
    String schoolName;
    int batchNumber;

    void printAll(){
        System.out.println("I am a student of batch " + batchNumber + " studying at " + schoolName + " in the year of " + year);
    }

    public static void main(String[] args) {
        VariablesInJava120 obj = new VariablesInJava120();
        obj.year = 2021;
        obj.schoolName = "Syntax";
        obj.batchNumber = 9;
        obj.printAll();
    }
}
