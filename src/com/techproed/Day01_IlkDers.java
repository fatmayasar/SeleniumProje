package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        // java projemizi chromedriver'i tanittik

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //selenium ile ilgili ilk kodumuz
        //webdriver nesnesi olusturarak chrome driver i kullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        //driver'a google.com'a gitmesini soyleyelim.
        webDriver.get("http://google.com");

        //driver'imizda acik olan pencereyi kapatma komutu, sadece bir pencere kapatir
        //webDriver.close();

        //driver'imizi komple kapatalim, tum pencereleri kapatir
        //webDriver.quit();

        //

    }
}
