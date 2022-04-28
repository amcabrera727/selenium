package com.syntax.class12.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class base {
    //method to open and close a browser
    public WebDriver driver;

    public void openWithSpecificURL(String url) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }
}