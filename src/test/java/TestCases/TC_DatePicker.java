package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TC_DatePicker {
    public static void main(String args[]) {

        String expectedDay = "6";
        String expectedMonth = "September";
        String expectedYear = "2023";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //Switch to iframe
        driver.switchTo().frame(0);
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();
        while (true) {
            String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear)) {
                List<WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement e : daysList) {
                    String CalendarDay = e.getText();
                    if (CalendarDay.equals(expectedDay)) {
                        e.click();
                        break;
                    }
                }
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

            }
        }
    }
}
