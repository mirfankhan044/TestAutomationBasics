package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_JavascriptExecuter {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Enter text in search box
        js.executeScript("document.getElementById('Search_Data').value='Achour';");

        //Click on find button
        WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));
        js.executeScript("arguments[0].click();", element);

        //Refresh Browser
        //js.executeScript("history.go(0)");

        //Return height and width of web page
        System.out.println("Height: " +js.executeScript("return window.innerHeight;").toString());
        System.out.println("Width: " +js.executeScript("return window.innerWidth;").toString());

        //To scroll a webpage up
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //To scroll a webpage down
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");



    }
}
