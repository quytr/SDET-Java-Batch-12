package com.syntax.class19;

public class Car {
    String name;
    String make;
    String color;
    String type;

    Car(String name, String make, String color, String type) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }
    Car(){

    }

    void printCar(){
        String name = "Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
