package Element;

import org.openqa.selenium.By;

public class TasdeeqEle {

    //android.widget.TextView[@text='Tasdeeq']
    //android.widget.ImageView[@resource-id= 'com.ceesolution.tasdeeqapp:id/ivTasdeeq']
    //android.widget.TextView[@text='Quick Verification']
    //android.widget.Button[@text='Proceed to add worker']
    //android.widget.EditText[@resource-id='com.ceesolution.tasdeeqapp:id/name']
    //android.widget.EditText[@resource-id='com.ceesolution.tasdeeqapp:id/number']
    //android.widget.EditText[@resource-id='com.ceesolution.tasdeeqapp:id/cnic']
    //android.widget.CheckBox
//android.widget.TextView[@text='Confirm']

    public By tasdeeq() {
        return By.xpath("//android.widget.TextView[@text='Tasdeeq']");
    }
    public By verifyWorker() {
        return By.xpath("//android.widget.ImageView[@resource-id= 'com.ceesolution.tasdeeqapp:id/ivTasdeeq']");
    }
    public By QuickVerification() {
        return By.xpath("//android.widget.TextView[@text='Quick Verification']");
    }
    public By Proceed() {
        return By.xpath("//android.widget.Button[@text='Proceed to add worker']");
    }
    public By name() {
        return By.xpath("//android.widget.EditText[@resource-id='com.ceesolution.tasdeeqapp:id/name']");
    }
    public By number() {
        return By.xpath("//android.widget.EditText[@resource-id='com.ceesolution.tasdeeqapp:id/number']");
    }
    public By cnic() {
        return By.xpath("//android.widget.EditText[@resource-id='com.ceesolution.tasdeeqapp:id/cnic']");
    }
    public By checkbox() {
        return By.xpath("//android.widget.CheckBox");
    }
    public By Confirm() {
        return By.xpath("//android.widget.TextView[@text='Confirm']");
    }
}