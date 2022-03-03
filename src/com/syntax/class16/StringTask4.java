package com.syntax.class16;

public class StringTask4 {

    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        //		input=>This is sentence i want to reverse
        //		output=>sihT si ecnetnes i tnaw ot esrever

        String c = "This is sentence I want to reverse";
//        String c = "racecar";
        StringBuilder newC = new StringBuilder(c);
        System.out.println(newC.reverse());

        String s = "Sunday";
        StringBuilder newS = new StringBuilder(s);
        newS.reverse();  //newS is StringBuilder, not String
        s = newS.toString();  //convert the object back to string
        System.out.println(s);
    }
}
