package com.replit.hw;

import java.util.Scanner;

public class StringManipulations100 {
    /*
    Write a for loop that will print out the reverse of the string.
     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        StringManipulations100 obj = new StringManipulations100();
        System.out.println(obj.reverseString(s));

    }
    String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
