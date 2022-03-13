package com.replit.hw;

public class MethodOverloading159 {
    /*
Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers

In main method execute all 3 methods to match the output:

Expected Output

40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
     */
}
class Main0{
    void subtract(int a, int b){
        System.out.println(a - b + " (should come from subtracting 2 numbers)");
    }
    void subtract(int a, int b, int c){
        System.out.println(a - b - c + " (should come from subtracting 3 numbers)");
    }
    void subtract(int a, int b, int c, int d){
        System.out.println(a - b - c -d + " (should come from subtracting 4 numbers)");
    }

    public static void main(String[] args) {
        new Main0().subtract(100,20,20,20);
        new Main0().subtract(90,30,30);
        new Main0().subtract(40,20);

    }
}
