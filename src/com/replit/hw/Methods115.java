package com.replit.hw;

public class Methods115 {
    /*
    Create a method that will accept a String as a parameter and return new String all in upper case

    Call method
     */
    void aString(String input){
        System.out.println(input.toUpperCase());
    }
    public static void main(String[] args) {
        Methods115 obj = new Methods115();
        obj.aString("test");
    }
}
