package TestCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TC_SectionScreenshot {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/");
        WebElement section = driver.findElement(By.xpath("//div[@class='container green']"));

        //Capture page section screenshot

        //Call getScreenshotAs method to create image file
        File src = section.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\M IRFAN KHAN\\IdeaProjects\\Test_Automation_Selenium_Java\\Screenshots\\SectionSS.png");

        //Copy Image file to destination
        FileUtils.copyFile(src, dest);

    }
}
