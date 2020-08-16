package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    /*
    1.driver'imizi ekrani kaplayacak sekilde kullanalim
    2.google.com'a gidelim
    3.sayfanin title'ini alalim ve ekrana yazalim
    4.daha sonra youtube.com'a gidelim
    5.sayfanin title'ini ve url'ini alalim ve ekrana yazdiralim
    6.google.com'a geri gelelim ve sayfanin url'ini alip ekrana yazdiralim
    7.driver'imizi kapatalim
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        String googleTitle = webDriver.getTitle();
        System.out.println(googleTitle);
        webDriver.navigate().to("http://youtube.com");
        String youtubeTitle = webDriver.getTitle();
        System.out.println(youtubeTitle);
        String youtubeUrl = webDriver.getCurrentUrl();
        System.out.println(youtubeUrl);
        webDriver.navigate().back();
        String googleUrl = webDriver.getCurrentUrl();
        System.out.println(googleUrl);
        webDriver.quit();


    }
}
