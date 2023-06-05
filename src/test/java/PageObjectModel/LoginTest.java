package PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Create object of LoginPage
        LoginPage2 login = new LoginPage2(driver);
        login.enterUserName("standard_user");
        login.enterPassword("secret_sauce");
        login.loginButton();

    }
}
