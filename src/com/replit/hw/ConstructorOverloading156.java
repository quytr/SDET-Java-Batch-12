package com.replit.hw;

public class ConstructorOverloading156 {
    /*
Overload Constructor of the Main class

Create 2 Objects of Main class to execute both constructors

Expected Output:

Welcome to the Syntax
I am the student at Technologies
     */
}
class Main7{
    public Main7(){
        System.out.println("Welcome to the Syntax");
    }
    public Main7(String school){
        System.out.println("I am the student at " + school);
    }

    public static void main(String[] args) {
        new Main7();
        new Main7("Technologies");
    }
}
