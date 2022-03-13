package com.syntax.class24;

public class Parent {
    final String name = "Kelly";
    final void method(){
//        name = "Anne";  can't reassign if a variable is final
        System.out.println("I am parent");
    }
    void m2(){

    }
}
class Child extends Parent{

    /*void method(){
        can't override because it is final method'
    }*/

}
