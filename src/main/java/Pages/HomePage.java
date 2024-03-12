package Pages;

import Element.HomeElement;
import Utility.DriverSetup;
import Utility.WaitClass;
import io.appium.java_client.AppiumDriver;

public class HomePage extends DriverSetup {
    WaitClass waitClass;
    HomeElement homeElement= new HomeElement();
    public HomePage(AppiumDriver driver)
    {
        this.driver= driver;
        waitClass= new WaitClass(driver);
    }

    public void HomePage()
    {
        waitClass.explictWait(homeElement.HomePage());
    }
}
