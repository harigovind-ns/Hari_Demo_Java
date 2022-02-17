package Hari.Demo.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Hari {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/remya/Documents/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("www.facebook.com");
    }

}
