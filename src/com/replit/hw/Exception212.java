package com.replit.hw;

import java.io.*;

public class Exception212 {
    /*
    Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

Expected Output:

java.io.FileNotFoundException:  (No such file or directory)
     */
    public static void File(String file){
        if(file == null){
            System.out.println(new FileNotFoundException("(No such file or directory)"));
        }else{
            System.out.println(file);
        }
    }


    public static void main(String[] args)  {
        File(null);

    }
}
class FileNotFoundException extends RuntimeException{
    FileNotFoundException(String errorMsg){
        super(errorMsg);
    }

}
