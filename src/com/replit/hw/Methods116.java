package com.replit.hw;

public class Methods116 {
    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

    ( Return false if one or both given numbers are not even)
     */

    boolean isEven(int num1, int num2){
        return num1%2==0 && num2%2==0;
    }

    public static void main(String[] args) {
        Methods116 obj = new Methods116();
        System.out.println(obj.isEven(4,6));
        System.out.println(obj.isEven(3,4));
        System.out.println(obj.isEven(-1,1));

    }
}
