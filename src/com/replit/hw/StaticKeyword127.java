package com.replit.hw;

public class StaticKeyword127 {
    /*
Create two methods:

The first method should be a non-static method that will print out the following message:

"Programming is amazing."

The second method should be a static method that will print out the following message:

"Java is awesome."

Execute both methods
     */

   void firstMethod(){
       System.out.println("Programming is amazing.");
   }

   static void secMethod(){
       System.out.println("Java is awesome.");
   }

    public static void main(String[] args) {
        StaticKeyword127 obj = new StaticKeyword127();
        obj.firstMethod();
        secMethod();
    }
}
