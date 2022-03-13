package com.syntax.class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening browser");
    }

    void loadPage(String URL){
        System.out.println("loading the website " + URL);
    }

    void testThePage(){
        System.out.println("Testing the page");
    }

    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening GoogleChrome browser");
    }

    void loadPage(String URL){
        System.out.println("loading the website " + URL + " in GoogleChrome");
    }

    void testThePage(){
        System.out.println("Testing the page in GoogleChrome");
    }

    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }
}

class Firefox extends Browser{
    void openBrowser(){
        System.out.println("Opening Firefox browser");
    }

    void loadPage(String URL){
        System.out.println("loading the website " + URL + " in Firefox");
    }

    void testThePage(){
        System.out.println("Testing the page in Firefox");
    }

    void closeBrowser(){
        System.out.println("Closing the Firefox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening Safari browser");
    }

    void loadPage(String URL){
        System.out.println("loading the website " + URL + " in Safari");
    }

    void testThePage(){
        System.out.println("Testing the page in Safari");
    }

    void closeBrowser(){
        System.out.println("Closing the Safari browser");
    }
}
class IE extends Browser{
    void openBrowser(){
        System.out.println("Opening IE browser");
    }

    void loadPage(String URL){
        System.out.println("loading the website " + URL + " in IE");
    }

    void testThePage(){
        System.out.println("Testing the page in IE");
    }

    void closeBrowser(){
        System.out.println("Closing the IE browser");
    }
}

