package com.syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownReview {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://fb.com");
            driver.manage().window().maximize();
            WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
            createNewAccount.click();
            Thread.sleep(3000);
            // get the desired dropdown
            WebElement daysoption = driver.findElement(By.id("day"));
            // use selenium select class
            Select days=new Select(daysoption);
            days.selectByValue("5");
            Thread.sleep(2000);
            days.selectByIndex(0);
            Thread.sleep(2000);
            days.selectByVisibleText("25");

            // Print all the options of dropdown
            //get all the options using select class.
            List<WebElement> options=days.getOptions();
            for (WebElement option:options){
                System.out.println(option.getText());
                //  option.getAttribute("value");

            }











        }
    }

