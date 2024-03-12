package Runner;

import Pages.*;
import Utility.DriverSetup;
import Utility.Listeners.AllureTestListener;
import Utility.PropertyFileReader;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


@Listeners(AllureTestListener.class)
public class TestngRunner extends DriverSetup {
    String destination = System.getProperty("user.dir") +"/allure-results";
    //   String destination = System.getProperty("user.dir") ;

    static String timestamp = new SimpleDateFormat("MM-dd-yyyy-[HH-mm-ss]").format(new Date());
    PropertyFileReader propertyFileReader = new PropertyFileReader();
    public PermissionPage permissionPage;
    public LoginPage loginPage;
    public OtpPage otpPage;

    public trustedDevicePage trustedDevicePage;

    public NotificationPage notificationPage;

    public HomePage homePage;

    public TasdeeqPAge tasdeeqPAge;

    @BeforeSuite
    public void StatingApplication()
    {
        Setup();
        System.out.println("--------------App Launched--------------");
    }

    @BeforeTest
    public void ObjectInitilization()
    {
        System.out.println("Object");
        permissionPage = new PermissionPage(driver);
        loginPage= new LoginPage(driver);
        otpPage = new OtpPage(driver);
        trustedDevicePage = new trustedDevicePage(driver);
        notificationPage= new NotificationPage(driver);
        homePage= new HomePage(driver);
        tasdeeqPAge = new TasdeeqPAge(driver);

    }


    @Epic("Permission and Instruction before login")
    @Story("Permission")
    @Description("Application location permission")
    @Test(priority = 0)
    public void permission()
    {
        permissionPage.AppPermission();
    }

    @Epic("Permission and Instruction before login")
    @Story("Instruction")
    @Description("Application Login page Instruction")
    @Test(priority = 1)
    public void Instruction()
    {
        permissionPage.permitt();
    }

    @Epic("Login")
    @Story("Login Without Number")
    @Description("Login Without Number")
    @Test(priority = 2)
    public void LoginWithoutNumber()
    {
        loginPage.Next();
        loginPage.EmptyLogin();
    }
    @Epic("Login")
    @Story("Login With Invalid Number")
    @Description("Login With Invalid Number")
    @Test(priority = 3)
    public void LoginWithInvalidNumber()
    {
        loginPage.InvalidLogin(propertyFileReader.properties.getProperty("InvalidUserNumber"));
    }

    @Epic("Login")
    @Story("Login With Valid Number")
    @Description("Login With Valid Number")
    @Test(priority = 4)
    public void LoginWitValidNumber()
    {
        loginPage.login(propertyFileReader.properties.getProperty("userNumber"));
    }

    @Epic("Sms Popup Handle")
    @Story("Sms Popup Handle")
    @Description("Sms Popup Handle")
    @Test(priority = 5)
    public void SmsPopupHandle()
    {
        loginPage.AllowSms();
    }


    @Epic("OTP")
    @Story("Correct Otp")
    @Description("Correct Otp")
    @Test(priority = 6)
    public void OTPScreen()
    {
        System.out.println("OTP Screen");
        otpPage.permit();
    }

    @Epic("Trusted Device")
    @Story("Trusted Device")
    @Description("Trusted Device")
    @Test (priority = 7)
    public void TrustedDevice()
    {
        System.out.println("Trusted Device ");
        trustedDevicePage.no();
    }

    @Epic("Home Page")
    @Story("Home Page")
    @Description("Home Page")
    @Test (priority = 8)
    public void HomePage()
    {
        homePage.HomePage();
    }
    @Epic("Notification")
    @Story("Notification")
    @Description("Notification")
    @Test (priority = 9)
    public void GotoNotification()
    {
        notificationPage.notification();
    }
    @Epic("Notification")
    @Story("Back to HomePage")
    @Description("Notification")
    @Test (priority = 10)
    public void BacktoHomeScreen()
    {
        notificationPage.back();
    }

    @Epic("Quick Verification")
    @Story("Verify new user by Quick Verification")
    @Description("Verify new user by Quick Verification")
    @Test (priority = 11)
    public void QuickVerification()
    {
        tasdeeqPAge.Gototasdeeq();
        tasdeeqPAge.quickVerify(propertyFileReader.properties.getProperty("Name"),propertyFileReader.properties.getProperty("number"),propertyFileReader.properties.getProperty("cnic"));
    }

    @Epic("Quick Verification")
    @Story("Verify already exist user by Quick Verification")
    @Description("Verify already exist user by Quick Verification")
    @Test (priority = 12)
    public void QuickVerificationForAlreadyVerifyUser()
    {
        tasdeeqPAge.quickVerify(propertyFileReader.properties.getProperty("Name"),propertyFileReader.properties.getProperty("number"),propertyFileReader.properties.getProperty("cnic"));
    }

    @Test (priority = 13)
    public void FailTestCase()
    {
        String expectedTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle);

        System.out.println(originalTitle+"   ,   "+expectedTitle);
    }

    @AfterSuite
    public void Quit()
    {
        closingDriver();

        File file = new File(destination);

        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File(destination+"_"+timestamp);

        // store the return value of renameTo() method in
        // flag
        boolean flag = file.renameTo(rename);

        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");
        }
        System.out.println("--------------App Closed Successfully--------------");
    }
}
