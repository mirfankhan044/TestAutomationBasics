package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerticalScroll {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scroll vertical down by 500 pixel
        //js.executeScript("window.scrollBy(0,500)");

        //Scroll till visibility of element
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Calorie Calculator']"));
        js.executeScript("arguments[0].scrollIntoView();", element);


    }
}
