package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
        /*ilk once ggoole.com a gidiniz
          ordan youtube.com a gidiniz
          google/com a back() ile donun
          youtube.com'a geri gidin. forward()
          youtube.com'u yelileyin
          driver'i kapatin
        */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();
    }
}
