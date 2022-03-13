package com.syntax.class24;

public abstract class File {
    abstract void open();

    void edit(){
        System.out.println("I can edit the file");
    }
    void close(){
        System.out.println("I can close the file");
    }
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("To open .pdf file we need Adobe Reader to be installed");
    }
}
class FileTester{
    public static void main(String[] args) {
        // if a method is not present inside the parent class, we cant call that method using polymorphism.
        // we can only call the method inside parent and child using polymorphism.
        File[] file = {new JavaFile(), new WordFile(), new PdfFile()};
//        for(File f : file){
//            f.open();
//            f.edit();
//            f.close();
//        }
        int i =0;
        while(i < file.length){
            file[i].open();
            file[i].edit();
            file[i].close();
            i++;
        }
    }
}
