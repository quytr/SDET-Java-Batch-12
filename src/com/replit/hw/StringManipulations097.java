package com.replit.hw;

import java.util.Scanner;

public class StringManipulations097 {
    /*
    Based on the user inputs program should give a correct answer.

    If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:

    "Proceed with Chrome browser"

    If browser is firefox, FIREFOX or FireFOX it should print the:

    "Proceed with Firefox browser"

    If browser is IE, ie or iE it should print the:

    "Proceed with IE browser"

    If any other browser it should print the:

    "Invalid browser"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();

        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Proceed with Chrome browser");
                break;
            case "firefox":
                System.out.println("Proceed with Firefox browser");
                break;
            case "ie":
                System.out.println("Proceed with IE browser");
                break;
            default:
                System.out.println("Invalid browser");
        }
    }
}
