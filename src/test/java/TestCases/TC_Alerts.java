package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alerts {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //Locate Username by id
        //driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //Switch to alert and click OK
        //driver.switchTo().alert().accept();

        //Switch to alert and cancel
        //driver.switchTo().alert().dismiss();

        //--------------------Prompt Alert--------------------//
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        driver.switchTo().alert().sendKeys("Irfan");
        driver.switchTo().alert().accept();
    }
}
