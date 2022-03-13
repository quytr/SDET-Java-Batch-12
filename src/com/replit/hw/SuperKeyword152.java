package com.replit.hw;

public class SuperKeyword152 {
    /*
In Parent class.

Create a constructor, it will take a String parameter called city.

include the logic of printing the parameter value.

Create another constructor without parameter.

Include the logic of printing "Parent Constructor".

Create a Child Class that should be a subclass of Parent class

Inside child class create a constructor that will make a call to parameterized constructor of the parent class.

In Main class.

Create an Object of the child class by passing String value "Vienna"

Expected Output:

Vienna
     */

}
class Parent{
    String city;

    public Parent(String city) {
        this.city = city;
        System.out.println(this.city);
    }
    Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    public Child(String city) {
        super(city);
    }
}
class Main3{
    public static void main(String[] args) {
        Child child = new Child("Vienna");

    }
}
