package com.syntax.reviewclass13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> personInfo = new HashMap<>();
        personInfo.put(1111,"Manana");
        personInfo.put(12352,"Salim");
        personInfo.put(45665,"Gulfde");
        personInfo.put(13425,"pot");
        personInfo.put(114523,"Eric");

        for(Map.Entry<Integer, String> entry : personInfo.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getClass());
        }
    }

}












