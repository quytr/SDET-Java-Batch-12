package com.replit.hw;

import java.util.Scanner;

public class StringManipulations103 {
    /*
    Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.

     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }


    }
}
