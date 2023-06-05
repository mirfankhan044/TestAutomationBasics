package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_RightClick {
    public static void main(String args[]) {
        //Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch Google Webpage
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the right-click action on the element
        actions.contextClick(button).perform();
    }
}

