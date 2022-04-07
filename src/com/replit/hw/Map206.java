package com.replit.hw;

import java.util.HashMap;
import java.util.Map;

public class Map206 {
    /*
    Create a Hash Map of String pairs

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using entry set print key and values pairs using loop

Remove below from Map

"ONE"

"FOUR"

Using entry set print key and values pairs using loop

Expected Output:

HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
     */
    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("ONE","AAA");
        maps.put("TWO","BBB");
        maps.put("THREE","CCC");
        maps.put("FOUR","DDD");
        maps.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String, String> map : maps.entrySet()){
            System.out.println(map.getKey() + " : " + map.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");

       maps.remove("ONE");
       maps.remove("FOUR");

       for(Map.Entry<String, String> map : maps.entrySet()){
           System.out.println(map.getKey() + " : " + map.getValue());
        }

    }

}
