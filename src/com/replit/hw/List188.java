package com.replit.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class List188 {
    /*
    Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line

Numbers in:

4
62
8
5
4
Expected Output:

4 62 8 5 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            nums.add(a);
        }
        for(Integer num: nums){
            System.out.print(num + " ");
        }


    }


}
