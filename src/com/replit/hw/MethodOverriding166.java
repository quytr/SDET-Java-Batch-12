package com.replit.hw;

public class MethodOverriding166 {
    /*
 Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.

Create a subclass Cat in which override method sleep

Create 3 Kitten subclasses of a Cat class and override method eat

for 1 kitten - eats milk

for 2 kitten - eats snack

for 3 kitten - eats everything

In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
     */
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
    void eat(){
        System.out.println(name + " eats");
    }
    void sleep(){
        System.out.println(name + " sleeps");
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println(name + " sleeps a lot");
    }
}
class Kitten1 extends Cat{

    public Kitten1(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats milk");
    }
}
class Kitten2 extends Cat{

    public Kitten2(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats snacks");
    }
}
class Kitten3 extends Cat{

    public Kitten3(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats everything");
    }
}
class Main1{
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for(Animal animal : animals){
            animal.eat();
            animal.sleep();
        }
    }
}
