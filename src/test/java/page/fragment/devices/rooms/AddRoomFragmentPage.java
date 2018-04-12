package page.fragment.devices.rooms;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AddRoomFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddRoomScreen";

    public AddRoomFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/add_group_name_edit_text")
    public WebElement roomNameTextBox;

    @AndroidFindBy(accessibility = "Multipurpose Sensor, Not selected")
    public WebElement multiPurposeSensorButton;

    @AndroidFindBy(accessibility = "Outlet, Not selected")
    public WebElement outletButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/save_menu")
    public WebElement saveButton;

    public void verifyAndClickOutletTile() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet is displayed");
        Logger.logStep("Verify Outlet is displayed");
        outletButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Outlet");
        Logger.logStep("Click on Outlet");
        outletButton.click();
    }

    public void verifyAndClickMutliPurposeSensorTile() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Multi Purpose Sensor is displayed");
        Logger.logStep("Verify Multi Purpose Sensor is displayed");
        multiPurposeSensorButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Multi Purpose Sensor");
        Logger.logStep("Click on Multi Purpose Sensor");
        multiPurposeSensorButton.click();
    }

    public void verifyAndClickSaveButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Save Button is displayed");
        Logger.logStep("Verify Save Button is displayed");
        saveButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Save Button");
        Logger.logStep("Click on Save Button");
        saveButton.click();
    }

    public void verifyAndClickRoomNameTextBox() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Room Name Text Box is displayed");
        Logger.logStep("Verify Room Name Text Box is displayed");
        roomNameTextBox.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Room Name Text Box");
        Logger.logStep("Click on Room Name Text Box");
        roomNameTextBox.click();
    }

    public void addRoomName (String text) {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Adding \"" + text + "\" Room Name");
        Logger.logStep("Adding \"" + text + "\" Room Name");
        roomNameTextBox.sendKeys(text);
        driver.hideKeyboard();
    }
}


