package com.replit.hw;

public class ThisKeyword148 {
    /*
In ShoppingStore class:

Create variables as below.

item,
price,
quantity
Create a constructor to initialize instance variables.

Create a method with name itemTotalPrice.

write a logic to to calculate the total values of items in stock. and print the result.

return the total value.

In Main Class.

Create two Object of ShoppingStore and pass the parameters to Constructor.

then using each object call the method itemTotalPrice.

Store the returned value of each object.

Calculate sum of both object and print the result.

Output:

Blanket Total Value 99.98
Blanket Total Value 99.98
Mattress Total Value 439.18
Mattress Total Value 439.18
You purchased 539.16 Today
     */

    public static void main(String[] args) {
        ShoppingStore shoppingStore = new ShoppingStore("Blanket", 99.98,1);
        shoppingStore.printAll();
        ShoppingStore shoppingStore1 = new ShoppingStore("Mattress", 439.18,1);
        shoppingStore1.printAll();
        System.out.println("Your purchased " + (shoppingStore.itemTotalPrice() + shoppingStore1.itemTotalPrice()) + " Today");
    }

}
class ShoppingStore{
    String item;
    double price;
    int quantity;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    public double itemTotalPrice(){
        double totalPrice = (quantity * price);
        return totalPrice;
    }
    public void printAll(){
        System.out.println(item + " Total Value " + itemTotalPrice());

    }
}
