package page.fragment.devices.rooms;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
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
        Logger.logStep("Verify Outlet is displayed");
        outletButton.isDisplayed();
        Logger.logStep("Click on outlet");
        outletButton.click();
    }

    public void verifyAndClickMutliPurposeSensorTile() {
        Logger.logStep("Verify Mutli Purpose Sensor is displayed");
        multiPurposeSensorButton.isDisplayed();
        Logger.logStep("Click on Mutli Purpose Sensor");
        multiPurposeSensorButton.click();
    }

    public void verifyAndClickSaveButton() {
        Logger.logStep("Verify Save Button is displayed");
        saveButton.isDisplayed();
        Logger.logStep("Click on Save Button");
        saveButton.click();
    }

    public void verifyAndClickRoomNameTextBox() {
        Logger.logStep("Verify Room Name Text Box is displayed");
        roomNameTextBox.isDisplayed();
        Logger.logStep("Click on Room Name Text Box");
        roomNameTextBox.click();
    }

    public void addSceneName (String text) {
        Logger.logStep("Adding Room Name");
        roomNameTextBox.sendKeys(text);
        driver.hideKeyboard();
    }
}


