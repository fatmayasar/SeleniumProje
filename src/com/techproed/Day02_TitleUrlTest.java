package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    /*
      1- youtube.com a gidelim
      2- title , video kelimesi iceriyor mu
      3- driver i kapatalim
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println(youtubeTitle);

        if (youtubeTitle.contains("video")){
            System.out.println("Video kelimesini iceriyor: "+ youtubeTitle);
        }else{
            System.out.println("Video kelimesini icermiyor: "+ youtubeTitle);
        }
        driver.quit();

    }
}
