package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ImageLink {
    public static void main(String args[]) {
        //Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M IRFAN KHAN\\Downloads\\Chrome webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch Google Webpage
        driver.get("https://www.opencart.com/");

        //Find Web Element of Image Link
        driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();

        //Verify title of current page with the home page title
        if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
            System.out.println("Test Case Passed");
        } else {
            System.out.println("Test Case Failed");
        }

    }
}
