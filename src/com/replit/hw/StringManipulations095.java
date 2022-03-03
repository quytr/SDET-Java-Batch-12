package com.replit.hw;

import java.util.Scanner;

public class StringManipulations095 {
    /*
    Using Scanner class input string value.

    Print out the following: "The first 3 letters of ___ is ___"

    For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input.substring(0,3));
    }
}
