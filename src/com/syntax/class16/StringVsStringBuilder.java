package com.syntax.class16;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        String s = "Asghar Is Great";  //original string
//        System.out.println(s.replace(" ",""));
        s.concat("hahaha");   //add new String hahaha to the original string
        System.out.println(s);  //printing out the original string


        //stringBuilder is the variable name
        StringBuilder stringBuilder = new StringBuilder("Asghar Is Great");  //original string
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);

        stringBuilder.append("hahaha");  //add new String hahaha to string
        System.out.println(stringBuilder);  //printing out after reassign the string value





    }
}
