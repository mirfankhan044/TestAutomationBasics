package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TC_FIleUpload {
    public static void main(String args[]) throws AWTException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        //driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\M IRFAN KHAN\\Downloads\\NITB Projects.txt");

        //----------File Upload using Robot Class---------------//
        WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button).click().perform();

        // Create a StringSelection object with the file path
        StringSelection selection = new StringSelection("C:\\Users\\M IRFAN KHAN\\Downloads\\NITB Projects.txt");

        // Create a Robot object
        Robot robot = new Robot();
        robot.delay(2000);

        // Set the clipboard contents to the StringSelection object
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Simulate pressing Enter to confirm the file selection in the file chooser dialog
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Simulate pressing Ctrl+V to paste the file path into the file name field
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing Enter to perform the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}

