package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String args[])
    {
        //Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch Google Webpage
        driver.get("https://www.google.com/");

        //Capture title of webpage and print
        String title = driver.getTitle();
        System.out.println("Page Title:"+ title);

        //Capture URL of Webpage
        System.out.println("URL:" + driver.getCurrentUrl());

        //Capture Page source of Webpage
        System.out.println("Page source:" + driver.getPageSource());


    }
}
