package com.syntax.class13;

public class MethodsHW5Solution {
	
	//Write a method to return whether given number is prime or not?
	
	boolean isPrime(int number) {
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
		return isPrime;
	}

	

	public static void main(String[] args) {
		
		MethodsHW5Solution obj = new MethodsHW5Solution();
		System.out.println(obj.isPrime(25));
		System.out.println(obj.isPrime(111));
		System.out.println(obj.isPrime(11));
		System.out.println(obj.isPrime(-12));

		
		

	}

}
