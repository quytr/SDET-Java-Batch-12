package com.syntax.class33;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Task2 {
    /*
    Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and
catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
     */
    public static void Exceptions(int a, int b){
        try{
            System.out.println(a/b);

        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }

    }
    public static void Exceptions(String a, String b){
        try{
            a.length();
            b.length();
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }
    }

    public static void Exceptions(int arrSize){
        try{
            int[] arr = new int[arrSize];
        }catch (NegativeArraySizeException negativeArraySizeException){
            System.out.println(negativeArraySizeException.getMessage());
        }
    }
    public static void Exceptions(String filename){
        File file = new File(filename);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException.getMessage());
        }

    }
    public static void main(String[] args) {
        Exceptions(-3);
        Exceptions(10,0);
        Exceptions("file");
        Exceptions("a",null);



    }
}
