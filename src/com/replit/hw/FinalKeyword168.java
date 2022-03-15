package com.replit.hw;

public class FinalKeyword168 {
    /*
 Create an instance final method that will reverse a String and return that new String

Call method from the main method

Expected Output:

olleh
     */
}
class Main000{
    final String str(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder = stringBuilder.reverse();
        return str = stringBuilder.toString();
    }

    public static void main(String[] args) {
        Main000 obj = new Main000();
        System.out.println(obj.str("hello"));
    }
}
//shorter version:
/*
class MainA{
    final String str(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new MainA().str("hello"));
    }
}
 */
