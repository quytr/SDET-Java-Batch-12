package com.replit.hw;

public class VariablesInJava124 {
    /*
Declare static variable in class level as below and assign its value:

String ss="Welcome To Syntax Technologies"

Access variable in the main method and print it using three ways you learned so far

Hint:

first way: By calling directly

Second way: By using the className

Third way: By creating the object of the class
     */

    static String ss = "Welcome To Syntax Technologies";

    public static void main(String[] args) {
        System.out.println(ss);
        System.out.println(VariablesInJava124.ss);
        VariablesInJava124 obj = new VariablesInJava124();
        System.out.println(obj.ss);
    }
}
