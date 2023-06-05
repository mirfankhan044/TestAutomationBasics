package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement element = driver.findElement(By.id("input-country"));
        Select dropdown = new Select(element);
        //Select by Visible Text
        dropdown.selectByVisibleText("Algeria");

        //Select by Value
        //dropdown.selectByValue("98");

        //Select by Index
        // dropdown.selectByIndex(2);
    }
}
