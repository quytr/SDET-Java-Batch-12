package com.replit.hw;

public class VariablesInJava126 {

    /*
Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;
     */

    static int count = 0;

    public static void main(String[] args) {
        VariablesInJava126 obj1 = new VariablesInJava126();
        obj1.count++;

        VariablesInJava126 obj2 = new VariablesInJava126();
        obj2.count++;

        VariablesInJava126 obj3 = new VariablesInJava126();
        obj3.count++;

        System.out.println(count);

    }
}
