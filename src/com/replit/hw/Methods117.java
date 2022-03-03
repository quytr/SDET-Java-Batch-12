package com.replit.hw;

public class Methods117 {
    /*
Create a method with the following specs:

Returns:

an integer
an integer
Name:

sumEvenToX
sumEvenToX
Parameters:

an integer called "x"
an integer called "x"
Purpose:

calculate the sum of the EVEN integers from 1 to x (including x)
     */

    int sumEvenToX(int x){
        int sum =0;
        for (int i = 2; i <= x; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Methods117 obj = new Methods117();
        System.out.println(obj.sumEvenToX(5));
        System.out.println(obj.sumEvenToX(8));
    }
}
