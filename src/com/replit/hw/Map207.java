package com.replit.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map207 {
    /*
 Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT

HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
     */
    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("ONE","AAA");
        maps.put("TWO","BBB");
        maps.put("THREE","CCC");
        maps.put("FOUR","DDD");
        maps.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");

        Iterator<Map.Entry<String, String>> iterator = maps.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        maps.replace("THREE", "ASEL");
        maps.replace("FIVE", "SUMAIR");
        iterator = maps.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
