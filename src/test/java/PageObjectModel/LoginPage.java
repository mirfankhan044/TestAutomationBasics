package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor
    LoginPage(WebDriver d) {
        driver = d;
    }

    By userName = By.id("user-name");
    By Password = By.id("password");
    By loginBtn = By.id("login-button");

    public void enterUserName(String uname) {
        driver.findElement(userName).sendKeys(uname);

    }

    public void enterPassword(String pwd) {
        driver.findElement(Password).sendKeys(pwd);

    }

    public void loginButton() {
        driver.findElement(loginBtn).click();

    }

}
