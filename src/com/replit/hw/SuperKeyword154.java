package com.replit.hw;

public class SuperKeyword154 {
    /*
In Parent Class.

Create a no-argument constructor and include the logic to print "Parent Constructor without argument"

Create another constructor that takes one parameter of integer type called number.

include the logic to print the value of the number.

In Child class.

Create a Constructor without parameter and include the logic to print "Child Constructor without argument"

Overload the constructor by adding one parameter of type integer

Inside the constructor call the parameterized parent class constructor.

In Main Class.

Create an object of Child without passing any argument.

And then another object of Child class by passing the value "10". run the application.

Expected Output:

Parent Constructor without argument
Parent Constructor without argument
Child Constructor without argument
Child Constructor without argument
10
     */
}
class Parent3{
    public Parent3(){
        System.out.println("Parent Constructor without argument");
    }
    public Parent3(int num){
        System.out.println(num);
    }
}
class Child3 extends Parent3{
    public Child3(){
        System.out.println("Child Constructor without argument");
    }
    public Child3(int num){
        super(num);
    }
}
class Main5{
    public static void main(String[] args) {
        new Child3();
        new Child3(10);
    }

}
