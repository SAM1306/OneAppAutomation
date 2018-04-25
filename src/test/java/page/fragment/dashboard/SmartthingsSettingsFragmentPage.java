package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;
import static utility.Events.scrollAndClick;

public class SmartthingsSettingsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SmartthingsSettingsScreen";

    public SmartthingsSettingsFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Samsung account']")
    public WebElement samsungAccount;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/wifi_bt_control")
    public WebElement wifiAndBluetoothAutoOn;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/wifi_bt_control_switch")
    public WebElement wifiAndBluetoothAutoOnToggleSwitch;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Turn on Wi-Fi and Bluetooth " +
            "automatically when SmartThings is opened so it can discover devices.']")
    public WebElement wifiAndBluetoothAutoOnOffMessage;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='On']")
    public WebElement wifiAndBluetoothAutoOnMessage;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mobile_presence_title")
    public WebElement useLocationInformation;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mobile_presence_switch")
    public WebElement useLocationInformationToggle;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Off']")
    public WebElement autoUpdateDeviceControllerButtonOff;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Wi-Fi only']")
    public WebElement autoUpdateDeviceControllerButtonWiFiOnly;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Wi-Fi or mobile data']")
    public WebElement autoUpdateDeviceControllerButtonWiFiOrMobileData;

    public SmartthingsSettingsFragmentPage getSmartthingsSettingsFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(samsungAccount));
        return new SmartthingsSettingsFragmentPage((AndroidDriver) driver);
    }

    public void verifySamsungAccountTextIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Samsung Account text is displayed");
        Logger.logStep("Verify Samsung Account text is displayed");
        assertTrue(samsungAccount.isDisplayed());
    }

    public void verifyWifiAndBluetoothAutoOnAndToggable() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Wi-Fi and Bluetooth auto on is present and can be toggled");
        Logger.logStep("Verify Wi-Fi and Bluetooth auto on is present");
        assertTrue(wifiAndBluetoothAutoOn.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Toggle Wi-Fi and Bluetooth auto on to off");
        Logger.logStep("Toggle Wi-Fi and Bluetooth auto on to off");
        wifiAndBluetoothAutoOnToggleSwitch.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify message when Wi-Fi and Bluetooth toggled off");
        Logger.logStep("Verify message when Wi-Fi and Bluetooth toggled off");
        assertTrue(wifiAndBluetoothAutoOnOffMessage.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Toggle Wi-Fi and Bluetooth auto on to on");
        Logger.logStep("Toggle Wi-Fi and Bluetooth auto on to on");
        wifiAndBluetoothAutoOnToggleSwitch.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify message when Wi-Fi and Bluetooth auto on to on");
        Logger.logStep("Verify message when Wi-Fi and Bluetooth auto on to on");
        assertTrue(wifiAndBluetoothAutoOnMessage.isDisplayed());
    }

    public void verifyUseLocationInformationIsPresentAndToggable() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Use location information is present and can be toggled");
        Logger.logStep("Verify Use location information is present");
        assertTrue(useLocationInformation.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Toggle Use location information to off");
        Logger.logStep("Toggle Use location information to off");
        useLocationInformationToggle.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Toggle Use location information to on");
        Logger.logStep("Toggle Use location information to on");
        useLocationInformationToggle.click();
    }

    public void verifyAutoUpdateController() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Scroll and Click to Auto Update Device Controller");
        Logger.logStep("Scroll and Click to Auto Update Device Controller");
        scrollAndClick("Auto update device controller");
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Off RadioButton is present");
        Logger.logStep("Verify Off RadioButton is present");
        assertTrue(autoUpdateDeviceControllerButtonOff.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Wi-Fi only RadioButton is present");
        Logger.logStep("Verify Wi-Fi only RadioButton is present");
        assertTrue(autoUpdateDeviceControllerButtonWiFiOnly.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Wi-Fi or mobile data RadioButton is present");
        Logger.logStep("Verify Wi-Fi or mobile data RadioButton is present");
        assertTrue(autoUpdateDeviceControllerButtonWiFiOrMobileData.isDisplayed());
    }
}
