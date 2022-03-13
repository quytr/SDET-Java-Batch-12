package com.replit.hw;

public class SuperKeyword155 {
    /*
    Create three classes (A, B, C)
Write two constructors:

Have a default constructor that prints out the following
For A: "I"

For B: "am"

For C: "a tester"

Make C extend B

and B extend A

From your Main class create an object of the C class.

     */
}
class AA{
    public AA(){
        System.out.println("I");
    }
}
class BB extends AA{
    public BB(){
        super();
        System.out.println("am");
    }
}
class CC extends BB{
    public CC(){
        super();
        System.out.println("a tester");
    }
}
class Main6{
    public static void main(String[] args) {
        new CC();
    }
}
