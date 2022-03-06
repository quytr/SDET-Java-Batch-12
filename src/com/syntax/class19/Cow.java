package com.syntax.class19;

public class Cow {

    static int normalNumberOfLegs =4;

    /*
    When we don't assign values to the instance fields, java assigns default values to the fields
    int=0
    double=0.0
    class objects with null
    boolean with =false
    chars \u0000
     */
    private String name;
    int age;
    double weight;
    String breed;
    char gender;

    Cow(){

    }

    void printName(){
        System.out.println('\u263A');
    }
}
