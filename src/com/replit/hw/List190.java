package com.replit.hw;

import java.util.LinkedList;

public class List190 {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

Expected Output:

0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(0);
        nums.add(1);

        for (int i = 0; i < 8; i++) {
            int next = nums.get(i) + nums.get(i+1);
            nums.add(next);
        }
        for(Integer num : nums){
            System.out.print(num + " ");
        }
    }
}
