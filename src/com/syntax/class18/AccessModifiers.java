package com.syntax.class18;

public class AccessModifiers {

    private String name = "Naughty Tarik ";
    int age = 50;  //default access
    protected double weight = 50;
    public String color = "White";

    public static void main(String[] args) {

        AccessModifiers a = new AccessModifiers();
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.weight);
        System.out.println(a.color);


    }
}
