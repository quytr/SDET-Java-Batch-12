package com.replit.hw;

public class Methods114 {
    /*
Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

for the addition method add two numbers to make 30

for multiplication multiply two numbers to make 30

for Subtraction subtract two numbers to equal 20
     */

    void multiplication(int num1, int num2) {
        System.out.println("Multiplication " + (num1 * num2));
    }

    void addition(int num1,int num2){
        System.out.println("Addition " + (num1+num2));
    }

    void subtraction(int num1, int num2){
        System.out.println("Subtraction " +(num1-num2));
    }

    public static void main(String[] args) {
        Methods114 obj = new Methods114();
        obj.addition(10,20);
        obj.multiplication(3,10);
        obj.subtraction(40,20);

    }
}
