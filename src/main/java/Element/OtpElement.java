package Element;

import org.openqa.selenium.By;

public class OtpElement {

    public By otpPermit()
    {
        return By.xpath("//android.widget.TextView[@text='Enter OTP Code Here']");
    }
}
