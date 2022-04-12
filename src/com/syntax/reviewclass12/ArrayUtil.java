package com.syntax.reviewclass12;

import java.util.ArrayList;

public class ArrayUtil {
    public static ArrayList<String> toArrayList(String[] strings){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String str : strings){
            if(str!= null){
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
