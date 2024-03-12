package Utility;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitClass {
    public static AppiumDriver driver;
    public WaitClass(AppiumDriver driver)
    {
        this.driver= driver;
    }

    PropertyFileReader obj = new PropertyFileReader();
    public  void threadSleep(){
        try {
            TimeUnit.SECONDS.sleep(Integer.parseInt(obj.properties.getProperty("TimeInSec")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void explictWait(By ele)
    {
        new WebDriverWait(driver, Integer.parseInt(obj.properties.getProperty("webExplicit"))).until(ExpectedConditions.visibilityOfElementLocated(ele));
    }
}

