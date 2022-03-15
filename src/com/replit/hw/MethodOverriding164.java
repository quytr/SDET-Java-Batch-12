package com.replit.hw;

public class MethodOverriding164 {
    /*
  Create a method hello() in parent class that will print "method in Parent class" then override
  that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"

In Main Class create 3 object of the child classes and store in into an array and call method hello():
     */
}
class Parent15{
    void hello(){
        System.out.println("method in Parent class");
    }
}
class Child15a extends Parent15{
    @Override
    void hello() {
        System.out.println("method in Child1 class");
    }
}
class Child15b extends Parent15{
    @Override
    void hello() {
        System.out.println("method in Child2 class");
    }
}
class Child15c extends Parent15{
    @Override
    void hello() {
        System.out.println("method in Child3 class");
    }
}
class Main16{
    public static void main(String[] args) {
        Parent15[] parents = {new Child15a(), new Child15b(), new Child15c()};
        for(Parent15 parent: parents){
            parent.hello();
        }
    }
}