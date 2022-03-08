package com.replit.hw;

public class VariablesInJava121 {
    /*
declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

Note: An object that is created using a class is said to be an instance of that class.
     */

    int num1;
    double num2;
    char a;

    public static void main(String[] args) {
        VariablesInJava121 obj1 = new VariablesInJava121();
        obj1.num1 =10;
        obj1.num2 = 10.23;
        obj1.a = 'a';
        System.out.println(obj1.num1);
        System.out.println(obj1.num2);
        System.out.println(obj1.a);

        VariablesInJava121 obj2 = new VariablesInJava121();
        obj2.num1 =100;
        obj2.num2 = 100.23;
        obj2.a = 's';
        System.out.println(obj2.num1);
        System.out.println(obj2.num2);
        System.out.println(obj2.a);


    }

}
