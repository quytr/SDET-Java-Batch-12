package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    /*
    Create a property file to store following configurations:
    browser=chrome
    url=https://facebook.com
    username
    password
    Read file and extract values of browser & url
     */
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\quytr\\IdeaProjects\\JavaBasics\\Files\\facebook.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("browser", "chrome");
        properties.put("url", "https://facebook.com");
        properties.put("username", "abdedf");
        properties.put("password", "pass456");
        properties.store(fileOutputStream,"Added some new fields");

        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));



    }
}
