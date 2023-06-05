package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CSS_Selectors {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Locate Username by tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        //Locate Password by tag[attribute=value]
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

        //Locate Login button by tag.value of class name
        driver.findElement(By.cssSelector("input.submit-button")).click();
    }
}
