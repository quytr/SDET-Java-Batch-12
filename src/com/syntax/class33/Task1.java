package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /*
    How would handle InputMismatchException?
    Input Mismatch Exception when user enters mismatch value then programmer expected.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        try{
            int age = sc.nextInt();

        }catch (InputMismatchException exception){
            System.out.println("Wrong input.");
        }

    }
}
