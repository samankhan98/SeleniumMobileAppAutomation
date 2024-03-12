package Element;

import org.openqa.selenium.By;

public class NotificationElement {
    public By Notification() {
        return By.xpath("/hierarchy / android.widget.FrameLayout / android.widget.LinearLayout / android.widget.FrameLayout / android.widget.LinearLayout / android.widget.FrameLayout / androidx.drawerlayout.widget.DrawerLayout / android.widget.LinearLayout / android.widget.FrameLayout / android.widget.RelativeLayout / android.widget.RelativeLayout");
    }
    public By Back() {
        return By.xpath("//android.widget.ImageView[@resource-id='com.ceesolution.tasdeeqapp:id/ivBack']");
    }
}
