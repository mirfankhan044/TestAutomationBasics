package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_iFrames {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        //Switch to iFrame
        driver.switchTo().frame("frame1");
        driver.findElement(By.tagName("input")).sendKeys("This is iFrame");

        //Switch to child frame
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();

        //Switch to default/main frame
        driver.switchTo().defaultContent();

    }
}
