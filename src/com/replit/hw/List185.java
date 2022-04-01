package com.replit.hw;

import java.util.ArrayList;

public class List185 {
    /*
    Create an arrayList of type Integer.

add below values.

111

111

111

999

999

999

Print all the values of List 1 by 1:

Expected Output:

111
111
111
999
999
999
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(111);
        nums.add(111);
        nums.add(111);
        nums.add(999);
        nums.add(999);
        nums.add(999);
        for(Integer num : nums){
            System.out.println(num);
        }
    }
}
