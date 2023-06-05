package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TC_FluentWait {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Wait for 10 seconds
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(10,TimeUnit.SECONDS)
                .pollingEvery(2,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);


            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gt-btn")));
            element.click();


        }
    }

