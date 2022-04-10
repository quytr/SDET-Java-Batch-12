package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\quytr\\Desktop\\Batch12\\Book1.xlsx";

        FileInputStream fileInputStreamt= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStreamt);
        Sheet sheet = xssfWorkbook.getSheetAt(0);

        Row row = sheet.createRow(6);
        row.createCell(0).setCellValue("Asel");
        row.createCell(1).setCellValue("Jiyatova");
        row.createCell(2).setCellValue(16);
        row.createCell(3).setCellValue("Brookyl");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);



    }
}
