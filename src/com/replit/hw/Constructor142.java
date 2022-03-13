package com.replit.hw;

public class Constructor142 {
    /*
 1. Complete the SyntaxTechnologies class:

Include the following class variables:

schoolName(String)

batch(int)

year(int)

lastDayOfClass(String)

Write two constructors:

non-argument constructor

parameterized constructor

Create method to display values of instance variables.

2. In Main Class:

Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
     */

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public Constructor142(String schoolName, int batch, int year, String lastDayOfClass) {
//        this.schoolName = schoolName;
//        this.batch = batch;
//        this.year = year;
//        this.lastDayOfClass = lastDayOfClass;
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
    public Constructor142(){
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }

    public static void main(String[] args) {
        new Constructor142();
        new Constructor142("Syntax", 6, 2020, "07/30/2020");
    }

}
