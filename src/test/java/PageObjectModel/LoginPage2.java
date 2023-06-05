package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
    WebDriver driver;

    LoginPage2(WebDriver d) {
        driver = d;
        //This method will create web element
        PageFactory.initElements(driver, this);
    }

    //Identify Web Elements
    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement button;

    public void enterUserName(String uname) {
        username.sendKeys(uname);

    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);

    }

    public void loginButton() {
        button.click();

    }

}
