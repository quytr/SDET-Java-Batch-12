package com.replit.hw;

public class StaticKeyword133 {
    /*
Create a static method with the following specs:

Returns:

an integer
an integer
Name:

countA
countA
Parameters:

a String called s
a String called s
Purpose:

count the number of occurrences of 'a' or 'A' within s
count the number of occurrences of 'a' or 'A' within s
Examples:

countA("aaa") ==> 3
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6
countA("aaBBdf8k3AAadnklA") ==> 6
Hint: How do you write a for loop to loop through every letter of a string? You've done this multiple times already :)
     */

    static int countA(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.toLowerCase().charAt(i) == 'a' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
