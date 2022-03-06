package com.syntax.class19;

public class Cat {

    String name = "Latte";
    String color = "white";
    double weight = 8;
    int age = 2;

    Cat(){

    }

    public Cat(String name, String color, double weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    void printCat(){
        System.out.println("My cat's name is " + name);
    }
}
