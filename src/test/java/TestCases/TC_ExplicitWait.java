package TestCases;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TC_ExplicitWait {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Wait for 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);

        Stopwatch watch = null;

        try {
            watch = Stopwatch.createStarted();
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-btn']")));
            element.click();

        } catch (Exception e) {
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
        }
    }
}
