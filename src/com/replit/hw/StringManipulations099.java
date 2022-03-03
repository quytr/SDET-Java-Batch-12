package com.replit.hw;

import java.util.Scanner;

public class StringManipulations099 {
    /*
Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

Examples of palindromes:

racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star
Your check should be case insensitive too. For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.

     */

    boolean isPalindrome(String str){
        return reverseString(str).equalsIgnoreCase(str);
    }

    String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();

        StringManipulations099 obj = new StringManipulations099();
        System.out.println(obj.isPalindrome(givenString.replaceAll(" ", "")));


    }
}
