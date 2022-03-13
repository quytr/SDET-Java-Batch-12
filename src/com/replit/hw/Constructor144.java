package com.replit.hw;

public class Constructor144 {
    /*
Step 1: Complete the StoreProduct.java class:

Create below instance variables. (Choose proper datatype and naming convention for variable )

label

price

category

hasExpiration

stock (represent the stock quantity)

Step 2: Write three constructors:

The main constructor( with all parameters)

Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)

Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)

Step 3: Method for display out put.

in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)

Step 4: in Main Class Create an object of StoreProduct Class with each constructors.

pass the values and then call the display method.

Step 5: Execute your application :)

Hint: each variable must be object specific
     */


    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    public Constructor144(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public Constructor144(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
        this.category = "misc";
        this.hasExpiration = false;
    }
    public Constructor144(String label, double price) {
        this.label = label;
        this.price = price;
        this.stock =0;
    }
    void storeProduct(){
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }

    public static void main(String[] args) {
        Constructor144 obj = new Constructor144("Eggs", 3.0, "Produce", true, 10);
        obj.storeProduct();
        Constructor144 obj1 = new Constructor144("Paper Towels", 2.0, 24);
        obj1.storeProduct();
        Constructor144 obj2 = new Constructor144("Paper Towels", 2.0);
        obj2.storeProduct();

    }

}
