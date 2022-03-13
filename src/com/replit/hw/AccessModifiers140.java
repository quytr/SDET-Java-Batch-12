package com.replit.hw;

public class AccessModifiers140 {
    /*
Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!
     */

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

    public static String maxLength(String[] arr){
        String input = "";
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].length() > arr[i].length()){
                input = arr[i-1];
            }else{
                input = arr[i];
            }
        }
        return input;
    }
}
//        return (arr[i - 1].length() > arr[i].length()) ? arr[i-1] : arr[i];
