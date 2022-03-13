package com.replit.hw;

public class AccessModifiers136 {
    /*
Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one

In each method write the logic accordingly like for private method write the logic in the println Statement
as "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total
of 4 outputs, please make sure they are in the same order that is printed below.
     */

    public void print1(){
        System.out.println("This is Public Method");
    }
    protected void print2(){
        System.out.println("This is Protected Method");
    }
    void print3(){
        System.out.println("This is Default Method");
    }
    private void print4(){
        System.out.println("This is Private Method");
    }

    public static void main(String[] args) {
        AccessModifiers136 obj = new AccessModifiers136();
        obj.print4();
        obj.print3();
        obj.print2();
        obj.print1();
    }
}
