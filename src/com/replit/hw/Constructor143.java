package com.replit.hw;

public class Constructor143 {
    /*
 Complete the Car.java class:
Create the following variable (Choose proper datatype)

make

model

numberOfDoors

topSpeed

price

following the proper naming convention for variables.

Write four constructors:

The first constructor(with all parameters)

A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)

A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor)

A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)

Create a display method in Cars class to print the class variable value in console.

Test your code with the Main.java class:
Create several Car objects using all Constructors.

then call display method with each object.

Output:

Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
     */

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Constructor143(String make, String model, int numberOfDoors, int topSpeed, double price){
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
    Constructor143(String make, String model, int topSpeed, double price){
        numberOfDoors = 4;
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
    Constructor143(int numberOfDoors, int topSpeed, double price){
        make = "unknown";
        model = "unknown";
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
    Constructor143(String make, String model, int numberOfDoors){
        topSpeed = 90;
        price =0;
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }

    public static void main(String[] args) {
        new Constructor143("Toyota", "Prius", 4, 120, 30000.0);
        new Constructor143("Toyota", "Prius", 120, 30000.0);
        new Constructor143( 4, 120, 30000.0);
        new Constructor143("Toyota", "Prius", 4 );


    }
}
