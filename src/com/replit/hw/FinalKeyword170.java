package com.replit.hw;

public class FinalKeyword170 {
    /*
Overload 2 final instance methods:

Call them in main method

Expected Output:

Final method with boolean parameter
Final method with String parameter
     */
}

class Main17{
    final void m1(boolean b){
        System.out.println("Final method with boolean parameter");
    }
    final void m1(String str){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        Main17 obj = new Main17();
        obj.m1(true);
        obj.m1("wow");
    }
}
