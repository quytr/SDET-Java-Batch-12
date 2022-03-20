package com.syntax.class26;

public class ShoppingCart {
    private double originalPrice = 100;
    private double discount = .15;

    public double getDiscount() {
        return discount;
    }

    void setDiscount(double discount){
        if(discount > 0 && discount <= .15){
            this.discount = discount;
        }else{
            System.out.println("Can't have that much discount");
        }
    }

    void calculatePrice(){
        double price = originalPrice - (originalPrice * discount);
        System.out.println(price);
    }
}

class ShoppingCartTester{
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.originalPrice =100;
//        shoppingCart.discount = .20;
        shoppingCart.setDiscount(.20);
        shoppingCart.calculatePrice();
        System.out.println(shoppingCart.getDiscount());
    }
}
