package com.syntax.class33;

import java.util.List;

public class Task2 {
    /*
    Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and
catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
     */
    public static List<String> Exceptions(){
        try{
            String name = null;
            name.length();
            int[] arr = new int[-5];
            String[] strArr = new String[2];
            strArr[5] = "Issues";
            String str = "aaa";
            str.charAt(10);
            System.out.println(10/0);

        }catch (ArithmeticException arithmeticException){
            System.out.println("1");
        }catch(NullPointerException nullPointerException){
            System.out.println("2");
        }catch(NegativeArraySizeException negativeArraySizeException){
            System.out.println("3");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("4");
        }catch (Exception exception){
            System.out.println("Something when wrong");
        }
        return null;
    }
    public static void main(String[] args) {


    }
}
