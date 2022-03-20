package com.syntax.class25;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing window");
    }

    @Override
    public void findElement() {
        System.out.println("find the element");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing window");
    }

    @Override
    public void findElement() {
        System.out.println("find the element");
    }
}

class WebTester{
    public static void main(String[] args) {
        WebDriver[] driver = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver d : driver) {
            d.openBrowser();
            d.closeBrowser();
            d.maximizeWindow();
            d.findElement();
        }
    }
}

