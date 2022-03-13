package com.syntax.class23;

public class StaticDemo {
    String name;
    int number;
}

class Cat{
    static int noOfLegs =4;
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(name + noOfLegs);
    }
    public static void print(){
        // we can't access the instance fields directly inside static methods
//        System.out.println(name + noOfLegs);
        //we cant use instance fields with static method
        //static method is not supporting the instant variable
        System.out.println(noOfLegs);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Latte");
        cat.print();
        Cat cat2 = new Cat("Luffy");
        cat2.print();
    }
}
