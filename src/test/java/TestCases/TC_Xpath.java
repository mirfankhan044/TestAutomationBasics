package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Xpath
{
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Locate Username by single attribute
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        //Locate Username by Contains method
        //driver.findElement(By.xpath("//input[contains(@id, user)]")).sendKeys("standard_user");

        //Locate Username by Starts-with method
        //driver.findElement(By.xpath("//input[starts-with(@name, user)]")).sendKeys("standard_user");

        //Locate Password by multiple attribute
        driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");

        //Locate Login button by single attribute
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //Switch to Product Page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);

        //Locate Sauce Labs Backpack by AND operator
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name ='add-to-cart-sauce-labs-backpack']")).click();

        //Locate Sauce Labs Bike Light by OR operator
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name ='add-to-cart-sauce-labs-bike-light']")).click();

    }
}
