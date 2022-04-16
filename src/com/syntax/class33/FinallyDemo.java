package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            String path = "C:\\Users\\quytr\\Desktop\\Batch12\\Book1.xlsx";
            fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheetAt(0);
        } catch (FileNotFoundException exception) {
            System.out.println("The file that you are trying to read is not present on provided path. " +
                    "Please check your path again.");
        } catch (IOException ioException) {
            System.out.println("Something with hard driver went wrong");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();  // print the exception
            }
        }
        System.out.println("now you should be able to perform other operation");
    }
}
