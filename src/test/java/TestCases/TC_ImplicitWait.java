package TestCases;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_ImplicitWait {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Stopwatch watch = null;

try {
    watch = Stopwatch.createStarted();
    driver.findElement(By.id("gt-btn")).click();
}
catch (Exception e)
{
    watch.stop();
    System.out.println(e);
    System.out.println(watch.elapsed(TimeUnit.SECONDS)  + " seconds");
}

    }
}
