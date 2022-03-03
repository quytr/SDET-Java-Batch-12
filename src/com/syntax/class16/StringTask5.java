package com.syntax.class16;

public class StringTask5 {

    boolean isPalindrome(String inputStr){
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }

    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        //How would you check if String is palindrome or not?
        // aba=> true
        //Abbc =>false

        StringTask5 task = new StringTask5();
        System.out.println(task.isPalindrome("ana"));
        System.out.println(task.isPalindrome("abbd"));

    }
}
