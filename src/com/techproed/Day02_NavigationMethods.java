package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();  //driver'in tum ekrani kaplamasini saglar
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com"); //get komutuyla ayni gorev
        webDriver.navigate().back(); // bi onceki sayfaya geri dondurur
        webDriver.navigate().forward(); //geri geldigimiz sayfaya gideriz
        webDriver.navigate().refresh(); // sayfayi yeniler
        //webDriver.close();
        //webDriver.quit();
    }
}
