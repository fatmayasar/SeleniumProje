package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Homework {
    /*1. Yeni bir class oluşturun :Homework
      2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
      3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
      4. Ardından Navigate to https://www.walmart.com/
      5. Walmart sayfa basliginin "Walmart.com" içerip içermediğini(contains) doğrulayın
      6. Navigate back to facebook
      7. Sayfayı yenileyin(refresh)
      8. Maximize the window
      9. Close the browse
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        String facebookTitle = driver.getTitle();
        System.out.println(facebookTitle);
        if(facebookTitle.contains("facebook")){
            System.out.println("facebook iceriyor: "+facebookTitle );
        }else{
            System.out.println("facebook icermiyor : "+facebookTitle);
        }
        String facebookUrl = driver.getCurrentUrl();
        System.out.println(facebookUrl);
        if (facebookUrl.contains("facebook")){
            System.out.println("facebook iceriyor: "+facebookUrl);
        }else{
            System.out.println("facebook icermiyor: "+facebookUrl);
        }
        driver.navigate().to("https://www.walmart.com/");
        String walmartTitle = driver.getTitle();
        System.out.println(walmartTitle);
        if (walmartTitle.contains("Walmart.com")){
            System.out.println("Walmart.com iceriyor: "+walmartTitle);
        }else{
            System.out.println("Walmart.com icermiyor: "+walmartTitle);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}
