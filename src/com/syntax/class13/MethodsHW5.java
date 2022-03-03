package com.syntax.class13;

public class MethodsHW5 {
	
	//Write a method to return whether given number is prime or not?
	
	void primeNumber(int number) {
	
		boolean isPrime = true;
		if(number > 1) {
			for(int i = 2; i < number; i++) {
				if(number%i ==0) {
					 isPrime = false;
					 break;
				}
			}
		}else {
			isPrime = false;
		}
		System.out.println(number + " isPrime " + isPrime);
	}

	public static void main(String[] args) {
		
		MethodsHW5 obj = new MethodsHW5();
		obj.primeNumber(11);
		obj.primeNumber(0);
		obj.primeNumber(25);
		obj.primeNumber(-23);
		obj.primeNumber(2);
		obj.primeNumber(29);

	}

}
