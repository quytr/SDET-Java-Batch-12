package com.replit.hw;

public class Exception211 {
    /*
    Create a program that will handle exception to match below output:

Expected Output:

java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
     */
    public static void main(String[] args) {
        try {
            int[] a = {1};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
//        int[] a = {1};
//        System.out.println(a[4]);
    }
}
