package com.replit.hw;

public class ThisKeyword145 {
    /*
Complete the Dog.java class:
Create following class variables.

dogName

dogWeight

static dogBreed=Mutt;

For all methods and variables use proper naming convention.

Create constructor to initialize instance variables

In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
Expected Output:

Tarzan Mutt 50.0
Lucy Mutt 10.0
     */
    public static void main(String[] args) {
        Dog dog = new Dog("Tarzan", 50.0);
        dog.printAll();
        Dog dog1 = new Dog("Lucy", 10.0);
        dog1.printAll();
    }

}
class Dog{
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    void printAll(){
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }
}
