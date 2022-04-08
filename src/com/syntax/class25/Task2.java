package com.syntax.class25;

public class Task2 {


}

interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser(){
        System.out.println("Opening Chrome Browser");

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }

}
