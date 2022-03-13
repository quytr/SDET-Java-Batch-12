package com.replit.hw;

public class MethodOverloading160 {
    /*
Overload instance method display by having different types of parameters

Inside each method write the logic to print value of the parameter

Call all methods inside your main method

Expected Output:

100
100
Syntax Technologies
Syntax Technologies
100.09
     */
}
class Main11{
    void display(int a){
        System.out.println(a);
    }
    void display(String str){
        System.out.println(str);
    }
    void display(double a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        new Main11().display(100);
        new Main11().display("Syntax Technologies");
        new Main11().display(100.09);

    }
}
