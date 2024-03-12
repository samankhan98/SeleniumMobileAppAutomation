package Runner;

import Utility.PropertyFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class main {
    public static void main(String[] args) {
        AppiumDriver driver;

        System.out.println("Starting the Application!");

        PropertyFileReader obj = new PropertyFileReader();
        try {
            System.out.println("Starting Mobile Application");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", obj.properties.getProperty("deviceName"));
            caps.setCapability("platformName", obj.properties.getProperty("platformName"));
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            caps.setCapability("platformVersion", obj.properties.getProperty("platformVersion"));
            caps.setCapability("appPackage", obj.properties.getProperty("appPackage"));
            caps.setCapability("appActivity", obj.properties.getProperty("appActivity"));
            //   caps.setCapability("unicodeKeyboard",true);//will not open keyboard will input
            //  caps.setCapability("resetKeyboard",true);// reset mob keyboard
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (Exception ex)
        {
            ex.getMessage();
        }

    }
}

