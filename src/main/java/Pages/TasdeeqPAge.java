package Pages;

import Element.TasdeeqEle;
import Utility.DriverSetup;
import Utility.WaitClass;
import io.appium.java_client.AppiumDriver;

public class TasdeeqPAge extends DriverSetup {
    WaitClass waitClass;
    public TasdeeqPAge(AppiumDriver driver) {
        this.driver = driver;
        waitClass= new WaitClass(driver);
    }

    TasdeeqEle tasdeeqEle = new TasdeeqEle();

    public void Gototasdeeq()
    {
        waitClass.explictWait(tasdeeqEle.tasdeeq());
        driver.findElement( tasdeeqEle.tasdeeq()).click();
        waitClass.explictWait(tasdeeqEle.verifyWorker());
        driver.findElement(tasdeeqEle.verifyWorker()).click();
    }

    public void quickVerify(String name, String num,  String cnic)
    {
        waitClass.explictWait(tasdeeqEle.QuickVerification());
        driver.findElement( tasdeeqEle.QuickVerification()).click();
        waitClass.explictWait(tasdeeqEle.Proceed());
        driver.findElement(tasdeeqEle.Proceed()).click();
        waitClass.explictWait(tasdeeqEle.name());
        driver.findElement(tasdeeqEle.name()).sendKeys(name);
        driver.findElement(tasdeeqEle.number()).sendKeys(num);
        driver.findElement(tasdeeqEle.cnic()).sendKeys(cnic);
        driver.findElement(tasdeeqEle.checkbox()).click();
        driver.findElement(tasdeeqEle.Confirm()).click();
    }

}
