package com.syntax.reviewclass09;


public class Doctor {
    //instance variables - declared inside the class but outside any method, constructor or
    String firstName, lastName, speciality;

    //static variable - declared inside the class but outside any method, constructors or
    static String hospital = "Jorge Washington";

    // static members can be accessed only static member
    static void work(){
        System.out.println("All doctors work at " + hospital);
    }

    //static method cannot access non static members. it will get an errors.
//    static void printInfo(){
//        System.out.println("Doctor " + firstName + " " + lastName + " is a " + speciality);
//    }

    //non static methods can access static members
    void work1(){
        System.out.println("All doctors work at " + hospital);
    }

    //constructor - initializing instance variables
    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //we can have multiple constructor by overloading them
    public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }

    void printInfo(){
        this.hello();
        System.out.println("Doctor " + firstName + " " + lastName + " is a " + speciality);
    }
    void hello(){
        System.out.println("Hello");
    }
}
class Hospital{
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John", "Smith", "Surgeon");
        doctor.printInfo();

        Doctor doctor1 = new Doctor("Jane", "Bond");
        doctor1.printInfo();
    }
}