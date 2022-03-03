package com.syntax.class18;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public static String reversedString(String str){

        return new StringBuilder(str).reverse().toString();
        // new StringBuilder(str) is called object creation
        // new StringBuilder(str).reverse() is calling a method on that object
        // new StringBuilder(str).reverse().toString() is calling a method on that object
        //return key is calling 2 methods on that object and return the results
    }

    public static void main(String[] args) {

        System.out.println(Task2.reversedString("java is fun"));
    }

}
