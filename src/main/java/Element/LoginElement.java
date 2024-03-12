package Element;

import org.openqa.selenium.By;

public class LoginElement {
    //android.widget.EditText[@text='XX-XXXXXXX']
    public By username()
    {
        return By.xpath("//android.widget.EditText[@text='XX-XXXXXXX']");
    }
    public By username2()
    {
        return By.xpath("//android.widget.EditText");
    }
    /* com.ceesolution.tasdeeqapp:id/btnNext*/
    public By Nextbtn()
    {
        return By.id("com.ceesolution.tasdeeqapp:id/btnNext");
    }
    public By invalid()
    {
        return By.xpath("//android.widget.TextView[@text='براہ کرم درست فون نمبر درج کریں']");
    }

    public By EmptyValidation()
    {
        return By.xpath(" //android.widget.TextView[@text='فون نمبر درج کرنا لازمی ہے۔']");
    }

    //android.widget.TextView[@text='براہ کرم درست فون نمبر درج کریں']

    //android.widget.TextView[@text='فون نمبر درج کرنا لازمی ہے۔']


    //android.widget.Button[@text='Allow']

    public By allowSms()
    {
        return By.xpath("//android.widget.Button[@text='Allow']");
    }

    //android.widget.TextView[@text='Enter OTP Code Here']
}
