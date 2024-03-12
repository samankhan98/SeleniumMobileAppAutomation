package Pages;

import Element.OtpElement;
import Utility.DriverSetup;
import Utility.WaitClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class OtpPage extends DriverSetup {
    OtpElement otpElement = new OtpElement();
    WaitClass waitClass;
    public OtpPage(AppiumDriver driver)
    {
        this.driver = driver;
        waitClass= new WaitClass(driver);
    }

    public void permit()
    {

        waitClass.explictWait(otpElement.otpPermit());
        driver.findElement(otpElement.otpPermit()).click();
    }
}
