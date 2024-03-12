package Pages;

import Element.trustedDeviceElement;
import Utility.DriverSetup;
import Utility.WaitClass;
import freemarker.ext.jsp.FreemarkerTag;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class trustedDevicePage extends DriverSetup {
    WaitClass waitClass;
    public trustedDevicePage(AppiumDriver driver)
    {
        this.driver=driver;
        waitClass = new WaitClass(driver);
    }


    trustedDeviceElement trustedDeviceElement = new trustedDeviceElement();


    public void no()
    {
        waitClass.explictWait(trustedDeviceElement.no());
        driver.findElement(trustedDeviceElement.no()).click();
    }
}
