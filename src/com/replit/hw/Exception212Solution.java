package com.replit.hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception212Solution {
    private static final String filename = "";
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(new File(filename)));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
