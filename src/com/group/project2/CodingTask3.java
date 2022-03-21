package com.group.project2;

public class CodingTask3 {
    /*
    Create a Class Car that would have the following
fields:   carPrice   and   color   and   method
calculateSalePrice() which should be returning a price
of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class   has   field   as   weight   and   has   its   own
implementation   of   calculateSalePrice()   method   in
which   returned   price   calculated   as   following:   if
weight>2000 then returned price car should include
10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it
is   own   implementation   of   calculateSalePrice():   if
length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
     */
}

abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }


    abstract double calculateSalePrice();
}

class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }


    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice - (carPrice * .05);
        } else {
            return carPrice - (carPrice * .10);
        }
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * .10);
        } else {
            return carPrice - (carPrice * .20);
        }
    }
}

class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(25000, "Black", 15);
        System.out.println("The sedan with " + sedan.length + " length, " + sedan.color + " color and the original price $"
                + sedan.carPrice + ", after the price sale is $" + sedan.calculateSalePrice());

        Sedan sedan2 = new Sedan(30000, "Silver", 30);
        System.out.println("The sedan with " + sedan2.length + " length, " + sedan2.color + " color and the original price $"
                + sedan2.carPrice + ", after the price sale is $" + sedan2.calculateSalePrice());

        Truck truck = new Truck(55000, "Blue", 3000);
        System.out.println("The truck with " + truck.weight + " weight, " + truck.color + " color and the original price $"
                + truck.carPrice + ", after the price sale is $" + truck.calculateSalePrice());

        Truck truck2 = new Truck(75000, "White", 1500);
        System.out.println("The truck with " + truck2.weight + " weight, " + truck2.color + " color and the original price $"
                + truck2.carPrice + ", after the price sale is $"  + truck2.calculateSalePrice());


    }
}
