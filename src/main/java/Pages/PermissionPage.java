package Pages;

import Element.PermissionElement;
import Utility.DriverSetup;
import Utility.WaitClass;
import io.appium.java_client.AppiumDriver;

public class PermissionPage extends DriverSetup {

    WaitClass waitClass;
    public PermissionPage(AppiumDriver driver) {
        this.driver = driver;
        waitClass= new WaitClass(driver);
    }

    PermissionElement permissionElement = new PermissionElement();

    public void AppPermission()
    {
       driver.findElement( permissionElement.Permission()).click();
    }

    public void permitt()
    {
        //waitClass.threadSleep();
        waitClass.explictWait(permissionElement.Permit());
        driver.findElement(permissionElement.Permit()).click();
        waitClass.explictWait(permissionElement.Permit2());
        driver.findElement(permissionElement.Permit2()).click();
        waitClass.explictWait(permissionElement.Permit3());
        driver.findElement(permissionElement.Permit3()).click();
    }

}
