package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class TC_FIleUploadAutoIT {
    public static void main(String args[]) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement button = driver.findElement(By.id("file-upload"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button).click().perform();
        Runtime.getRuntime().exec("C://Users//M IRFAN KHAN//Desktop//AutoIT//FileUpload.exe" + "" +"C:\\Users\\M IRFAN KHAN\\Downloads\\NITB Projects.txt");
    }
}
