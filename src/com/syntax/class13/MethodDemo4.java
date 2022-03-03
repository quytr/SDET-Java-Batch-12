package com.syntax.class13;

public class MethodDemo4 {
	
	//create a method that takes a boolean isSaleOn double price double discount
	//if isSaleOn = true return discounted price
	//otherwise return original price
	
	double priceItem (boolean isSaleOn, double price, double discount) {
		if(isSaleOn) {
			return price - price*discount;
		}else {
			return price;
		}
		
	}

	public static void main(String[] args) {
		MethodDemo4 obj = new MethodDemo4();
		System.out.println(obj.priceItem(true, 100, 0.6));
		System.out.println(obj.priceItem(false, 99.80, 0));

	}

}
