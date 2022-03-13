package com.replit.hw;

public class ThisKeyword147 {
    /*
 In carObject class:

Create instance variables as below.

model
price,
quantity
Create a constructor that will initialize instance variables.

Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

run the application in Main Class

Expected Output:

Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
     */
    public static void main(String[] args) {
        CarObjects carObjects = new CarObjects("Toyota 2019", 25000.0, 100 );
        carObjects.carStockValue();
        CarObjects carObjects1 = new CarObjects("BMW 2019", 65298.0,10);
        carObjects1.carStockValue();

    }

}

class CarObjects{
    String model;
    double price;
    int quantity;

    public CarObjects(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    void carStockValue(){
        System.out.println(model + " Stock Value " + (price * quantity) );
    }
}


