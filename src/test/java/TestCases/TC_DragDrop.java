package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_DragDrop {
    public static void main(String args[]) {
        //Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch Google Webpage
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Find the source element to drag
        WebElement sourceElement = driver.findElement(By.id("box6"));

        // Find the target element to drop onto
        WebElement targetElement = driver.findElement(By.id("box103"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the drag and drop action
        actions.dragAndDrop(sourceElement, targetElement).perform();
    }
}

