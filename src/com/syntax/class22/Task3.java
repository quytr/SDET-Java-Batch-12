package com.syntax.class22;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    static void sum (int x, int y){
        System.out.println("The sum of " + x + " and " + y + " is " +(x+y));
    }

    static void sum(double x, double y){
        System.out.println("The sum of " + x + " and " + y + " is " +(x+y));
    }

    static void sum(int x, double y){
        System.out.println("The sum of " + x + " and " + y + " is " +(x+y));
    }

    public static void main(String[] args) {
        sum(5,10);
        sum(5.5,10.0);
        sum(4,9.8);
    }

}
