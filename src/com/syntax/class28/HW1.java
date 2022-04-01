package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;


public class HW1 {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {
        Car car = new Car("Geico", "Toyota");
        Pet pet = new Pet("Pumpkin", "Cat");
        Health health = new Health("Cigna");

        ArrayList<String> objs = new ArrayList<>();
        objs.add(car.getQuote());
        objs.add(car.cancelInsurance());
        objs.add(pet.getQuote());
        objs.add(pet.cancelInsurance());
        objs.add(health.getQuote());
        objs.add(health.cancelInsurance());

        for (int i = 0; i < objs.size(); i++) {
            System.out.println(objs.get(i));
        }

        for (String obj : objs) {
            System.out.println(obj);
        }

        Iterator<String> iterator = objs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

abstract class Insurance {
    String insuranceName;
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    abstract String getQuote();
    abstract String cancelInsurance();
}
class Car extends Insurance {
    String carModel;
    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    String getQuote() {
        return "Getting a car insurance quote from " + insuranceName + " company for " + carModel;
    }
    @Override
    String cancelInsurance() {
        return "Canceling car insurance from " + insuranceName + " company for " + carModel;
    }
}
class Pet extends Insurance {
    String petType;
    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    String getQuote() {
        return "Getting a pet insurance quote from " + insuranceName + " company for " + petType;
    }
    @Override
    String cancelInsurance() {
        return "Canceling pet insurance from " + insuranceName + " company for " + petType;
    }
}
class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    String getQuote() {
        return "Getting a health insurance quote from " + insuranceName + " company";
    }
    @Override
    String cancelInsurance() {
        return "Canceling a health insurance from " + insuranceName + " company";
    }
}

