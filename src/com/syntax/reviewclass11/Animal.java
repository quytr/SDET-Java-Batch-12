package com.syntax.reviewclass11;

public class Animal {
    void Sleep(){
        System.out.println("Animals sleep");
    }

}

class Dog extends  Animal{
    void sleep(){
        System.out.println("Dog sleeps in the day");
    }
    void Eat(){
        System.out.println("We like to eat meat");
    }

}

class Cat extends Animal{
    void Sleep(){
        System.out.println("Cat sleeps all the day");
    }
    void Eat(){
        System.out.println("We like to eat fish");
    }
}

class Tester2{
    public static void main(String[] args) {
//        Cat cat = new Dog();
//        Cat cat = new Animal();  // downcasting
        Animal animal = new Dog();  //upcasting
        Dog dog = (Dog)animal;
        dog.sleep();
        dog.Eat();

        Animal animal1 = new Cat();
        animal1.Sleep();
        //we can't use the methods that are specific to Cat class only because right now it is behaving as an animal
//        animal1.Eat();

    }

    public static void method(Animal animal){
        //instanceof method checks if indeed animal box contains Cat class, return true or false

        if(animal instanceof Cat){
            ((Cat)animal).Eat();
        }else{
            System.out.println("You are not passing a cat inside the box animal");
        }


    }

}
