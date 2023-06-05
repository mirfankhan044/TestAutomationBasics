package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Locators {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Locate Username by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Locate Password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Locate Login button by Class name
        driver.findElement(By.className("submit-button")).click();

        //Switch to Product Page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);

        //Locate Sauce Labs Bolt T-Shirt by LinkText
        driver.findElement(By.linkText("Sauce Labs Bike Light")).click();


    }
}
