package com.syntax.reviewclass13;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/com/syntax/reviewclass13/Notes";

        File file = new File(path);
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
