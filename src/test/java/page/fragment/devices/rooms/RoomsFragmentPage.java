package page.fragment.devices.rooms;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

import static junit.framework.TestCase.assertTrue;

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
        Logger.logStep("Verify Delete Button is displayed");
        deleteRoomButton.isDisplayed();
        Logger.logStep("Click on Delete Button");
        deleteRoomButton.click();
    }

    public void verifyAndClickConfirmDeleteButtonButton() {
        Logger.logStep("Verify Confirm Delete Button is displayed");
        confirmDeleteButton.isDisplayed();
        Logger.logStep("Click on Confirm Delete Button");
        confirmDeleteButton.click();
    }

    public void verifyMultiPurposeSensor() {
        Logger.logStep("Verify Multi Purpose Sensor is displayed");
        verifyMultiPurposeSensor.isDisplayed();
    }

    public void verifyAndClickManageDevicesButtonButton() {
        Logger.logStep("Verify Manage Devices Button is displayed");
        manageDevicesButton.isDisplayed();
        Logger.logStep("Click on Manage Devices Button");
        manageDevicesButton.click();
    }

    public void verifyCreatedRoom() {
        Logger.logStep("Verify Created Room is displayed");
        assertTrue(createdRoom.isDisplayed());
    }
}
