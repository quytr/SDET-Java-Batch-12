package com.CTP;

import java.util.*;

public class PutCountWithWords {
    /*
    Count the number of repetations of words in an ArrayList append that count and return that list.
    You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry where it is repeated and append the count
i.e how many times that word was present previously

More Exmaples

input ["switch","tv","switch","tv","switch","tv","radio"]

output [switch, tv, switch1, tv1, switch2, tv2, radio]

input ["switch","tv","switch","tv"]

output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]

output [switch, tv]
     */
    public static List<String> countDeviceNames(List<String> deviceNames) {
        List<String> newList = new ArrayList<>();

        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String device : deviceNames) {
            if (counts.containsKey(device)) {
                counts.put(device, counts.get(device) + 1);
            } else {
                counts.put(device, 1);
            }
        }
//        System.out.println(counts);
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
//            System.out.println(entry);
//            newList.add(entry.getKey());
            if (entry.getValue() > 1) {
                newList.add(entry.getKey());
            } else {
                newList.add(entry.getKey());
            }


//            for (int i = 1; i <= entry.getValue(); i++) {
//                if (entry.getValue() > 1) {
//                    newList.add(entry.getKey() + i);
//                } else {
//                    newList.add(entry.getKey());
//                }
//            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("switch");
        a.add("TV");
        a.add("switch");
        a.add("TV");
        a.add("switch");
        a.add("TV");
        System.out.println(countDeviceNames(a));


        List<String> b = new ArrayList<>();
        b.add("switch");
        b.add("TV");
        b.add("switch");
        b.add("TV");
        b.add("radio");
        System.out.println(countDeviceNames(b));


        List<String> c = new ArrayList<>();
        c.add("switch");
        c.add("TV");
        System.out.println(countDeviceNames(c));

    }
}
