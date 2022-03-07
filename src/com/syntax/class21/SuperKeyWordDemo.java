package com.syntax.class21;

public class SuperKeyWordDemo {

    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
        child.print();
    }

}

class GrandParent{
    String color = "Blue";
    void printInfo(){
        System.out.println("I am grandparent");
    }
}

class Parent extends GrandParent{
    String color = "Black";
    void printInfo(){
        System.out.println("I am parents");
    }
}

class Child extends Parent{
    String color = "Red";
    void printInfo(){
        System.out.println("I am child");
    }
    void print(){
        printInfo();
        super.printInfo();
    }

    void printColor(){
        String color = "Green";
        System.out.println(color);  //local variable
        System.out.println(this.color);  //instance variable
        System.out.println(super.color);  //parent variable
    }
}
