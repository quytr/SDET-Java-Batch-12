package com.replit.hw;

import java.util.LinkedList;

public class List192 {
    /*
    Create an Linked List that will store all prime numbers from 1 to 100

Step 1. Create a method that will identify wether number is prime or not

Step 2. Add all prime numbers into Linked List

Print Linked List:

Expected Output:

[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
     */
    public static boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }
}
