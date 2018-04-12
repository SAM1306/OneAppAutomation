package page.fragment.devices.rooms;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class RoomsFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "RoomsScreen";

    public RoomsFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Test Room']")
    public WebElement createdRoom;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/manage_devices_button")
    public WebElement manageDevicesButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/remove_place_button")
    public WebElement deleteRoomButton;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement confirmDeleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Multipurpose Sensor']")
    public WebElement verifyMultiPurposeSensor;

    public void verifyAndClickDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Verify Delete Button is displayed");
        deleteRoomButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteRoomButton.click();
    }

    public void verifyAndClickConfirmDeleteButtonButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Confirm Delete Button is displayed");
        Logger.logStep("Verify Confirm Delete Button is displayed");
        confirmDeleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Confirm Delete Button");
        Logger.logStep("Click on Confirm Delete Button");
        confirmDeleteButton.click();
    }

    public void verifyMultiPurposeSensor() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Multi Purpose Sensor is displayed");
        Logger.logStep("Verify Multi Purpose Sensor is displayed");
        assertTrue(verifyMultiPurposeSensor.isDisplayed());
    }

    public void verifyAndClickManageDevicesButtonButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Manage Devices Button is displayed");
        Logger.logStep("Verify Manage Devices Button is displayed");
        manageDevicesButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Manage Devices Button");
        Logger.logStep("Click on Manage Devices Button");
        manageDevicesButton.click();
    }

    public void verifyCreatedRoom() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Created Room is displayed");
        Logger.logStep("Verify Created Room is displayed");
        assertTrue(createdRoom.isDisplayed());
    }
}
