package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1Class28 {
    /*
   Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
   Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
   Create 3 objects of the sub classes and store them in ArrayList.
   Using for loop/advanced for loop/ iterator access all methods of the class.
    */
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("AdamsG", "Tesla S"));
        insurances.add(new Pet("CamelInsurance", "Horse"));
        insurances.add(new Health("Keiser"));


        for (Insurance insurance : insurances) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }

        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
           Insurance i = iterator.next();
           i.getQuote();
           i.cancelInsurance();
        }

    }
}

abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("getting quote for a Car " + carModel + " from " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("please cancel my Car insurance " + carModel + " from " + insuranceName);
    }

    @Override
    public String toString() {
        return "Car{" +
                "insuranceName='" + insuranceName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}

class Pet extends Insurance {
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {

        System.out.println("getting the quote for the Pet " + petType + " from " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for the pet " + petType + " from " + insuranceName);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "insuranceName='" + insuranceName + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {

        System.out.println("quote for health insurance from " + insuranceName);
    }

    @Override
    public void cancelInsurance() {

        System.out.println("cancel the health insurance from " + insuranceName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

