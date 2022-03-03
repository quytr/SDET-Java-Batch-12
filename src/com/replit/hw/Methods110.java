package com.replit.hw;

public class Methods110 {
    /*
    1.Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"

    2.Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"

    3.Call both methods
     */
    void newLine(){
        System.out.println("newLine method implementation");
    }

    void displayLine(){
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        Methods110 obj = new Methods110();
        obj.newLine();
        obj.displayLine();
    }
}
