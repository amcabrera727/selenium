package com.syntax.reviewclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReviewBasic {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.gmail.com");


        driver.quit();
        driver.close();
    }
}
