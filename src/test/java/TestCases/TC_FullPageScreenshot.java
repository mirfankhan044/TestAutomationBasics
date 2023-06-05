package TestCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TC_FullPageScreenshot {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/");

        //Capture full page screenshot
        //Convert Web driver object to screenshot interface
        TakesScreenshot screenshot = ((TakesScreenshot) driver);

        //Call getScreenshotAs method to create image file
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\M IRFAN KHAN\\IdeaProjects\\Test_Automation_Selenium_Java\\Screenshots\\FullPage.png");

        //Copy Image file to destination
        FileUtils.copyFile(src, dest);

    }
}
