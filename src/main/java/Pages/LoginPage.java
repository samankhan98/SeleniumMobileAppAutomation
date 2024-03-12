package Pages;

import Element.LoginElement;
import Utility.DriverSetup;
import Utility.WaitClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends DriverSetup {
    WaitClass waitClass;

    LoginElement loginElement = new LoginElement();
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        waitClass= new WaitClass(driver);
    }

    public void login(String number)
    {
        driver.findElement(loginElement.username2()).clear();
        waitClass.explictWait(loginElement.username());
        driver.findElement(loginElement.username()).sendKeys(number);
        waitClass.explictWait(loginElement.Nextbtn());
        driver.findElement(loginElement.Nextbtn()).click();
    }

    public void Next()
    {
            waitClass.explictWait(loginElement.Nextbtn());
            driver.findElement(loginElement.Nextbtn()).click();
    }
    public void EmptyLogin()
    {
        waitClass.explictWait(loginElement.Nextbtn());
        driver.findElement(loginElement.Nextbtn()).click();
        waitClass.explictWait(loginElement.EmptyValidation());
    }
    public void InvalidLogin(String invalidNumber)
    {
        driver.findElement(loginElement.username()).sendKeys(invalidNumber);
        driver.findElement(loginElement.Nextbtn()).click();
        waitClass.explictWait(loginElement.invalid());
    }

    public void AllowSms()
    {
        waitClass.explictWait(loginElement.allowSms());
        driver.findElement(loginElement.allowSms()).click();
    }
}
