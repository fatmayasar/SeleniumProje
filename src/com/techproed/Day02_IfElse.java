package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String pageTitle = driver.getTitle();

        if (pageTitle.toLowerCase().contains("Car")){
            System.out.println("car kelimesi iceriyor. :" + pageTitle);
        }else{
            System.out.println("car kelimesi icermiyor. :" + pageTitle);
        }

        if (pageTitle.contains("Books")){
            System.out.println("Books kelimesini iceriyor :"+pageTitle);
        }else{
            System.out.println("Books kelimesini icermiyor :"+pageTitle);
        }

        driver.quit();
    }

}
