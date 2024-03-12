package Element;

import org.openqa.selenium.By;

public class PermissionElement {

    public By Permission() {
        return(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    }

    public By Permit()
    {
        //return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        return By.xpath("//android.widget.TextView[@text='Tap To Play']");
    }

    //android.widget.TextView[@text='Enter Phone Number Here']
    public By Permit2()
    {
        return By.xpath("//android.widget.TextView[@text='Enter Phone Number Here']");}
//android.widget.TextView[@text='Submit From Here']

    public By Permit3()
    {
        return By.xpath("//android.widget.TextView[@text='Submit From Here']");}


}
