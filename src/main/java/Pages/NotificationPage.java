package Pages;

import Element.NotificationElement;
import Utility.DriverSetup;
import Utility.WaitClass;
import io.appium.java_client.AppiumDriver;

public class NotificationPage extends DriverSetup {

    WaitClass waitClass;
    NotificationElement notificationElement = new NotificationElement();
    public NotificationPage(AppiumDriver driver)
    {
        this.driver=driver;
        waitClass = new WaitClass(driver);
    }

    public void notification()
    {
        waitClass.explictWait(notificationElement.Notification());
        driver.findElement(notificationElement.Notification()).click();
    }
    public void back()
    {
        waitClass.threadSleep();
        waitClass.explictWait(notificationElement.Back());
        driver.findElement(notificationElement.Back()).click();
    }
}
