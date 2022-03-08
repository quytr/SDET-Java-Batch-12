package com.replit.hw;

public class StaticKeyword134 {
    /*
Write a method with the following specs:

Returns:

an integer
an integer
Name:

countVowels
countVowels
Parameters:

a String called s
a String called s
Purpose:

count the number of vowels in the string s.  Assume s is all lowercase.
count the number of vowels in the string s.  Assume s is all lowercase.
Examples:

countVowels("obama") ==> 3
countVowels("happy friday! i love weekends") ==> 9
     */
    static int countVowels(String s){
//        return s.toLowerCase().replaceAll("[^aeuoi]", "").length();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e'|| s.toLowerCase().charAt(i) == 'u'||s.toLowerCase().charAt(i) == 'i' ||s.toLowerCase().charAt(i) == 'o'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
