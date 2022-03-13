package com.replit.hw;

public class AccessModifiers137 {
    /*
In main class please declared the variables using different access modifiers that will hold value for:

name
city
name of the school
batch number
Create a method to display details in following format:

My name is ___ and I live in ___. I study at ___ in batch ___

Assign values to the variables and execute method display
     */

    public String name;
    private String city;
    String school;
    protected int batch;

    public void printAll(){
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + school + " in batch " + batch);
    }

    public static void main(String[] args) {
        AccessModifiers137 obj = new AccessModifiers137();
        obj.name = "John";
        obj.city = "Miami";
        obj.school = "Syntax";
        obj.batch = 9;
        obj.printAll();
    }
}
