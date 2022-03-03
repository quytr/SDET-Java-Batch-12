package com.syntax.class16;

public class StringTask4Extra {

    public static void main(String[] args) {
        /*
        get the words from the syntax
        reverse the words
        append the words to get the sentence back
         */

        String s = "Sunday is great";
        StringTask4Extra task4 = new StringTask4Extra();
//        System.out.println(task4.reverseString(s));
        String[] strArray = s.split(" ");

        for(int i =0; i < strArray.length; i++){
            System.out.print(task4.reverseString(strArray[i]) + " ");
        }

    }
    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
