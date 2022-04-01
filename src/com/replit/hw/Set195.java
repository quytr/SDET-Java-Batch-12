package com.replit.hw;

import java.util.HashSet;

public class Set195 {
    /*
    Create the HashSet with list of Integers add the below numbers for the list

111

111

111

999

999

999

Print elements one by one.

Expected Output

999
111
     */

    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
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
