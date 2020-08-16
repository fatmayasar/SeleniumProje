package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");
        String pageTitle = webDriver.getTitle();
        String pageUrl = webDriver.getCurrentUrl();
        System.out.println(pageTitle);
        System.out.println(pageUrl);
        webDriver.quit();

    }
}
