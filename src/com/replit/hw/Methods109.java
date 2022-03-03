package com.replit.hw;

public class Methods109 {
    /*
Create method name it as newLine

Add print statement inside method body as "newLine method implementation"

Call newLine method three times
     */
    void newLine(){
        System.out.println("newLine method implementation");
    }
    public static void main(String[] args) {
        Methods109 obj = new Methods109();

        for (int i = 0; i < 3; i++) {
            obj.newLine();
        }

    }
}
