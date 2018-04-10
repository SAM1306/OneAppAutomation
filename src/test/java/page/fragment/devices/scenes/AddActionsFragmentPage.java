package page.fragment.devices.scenes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

public class AddActionsFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddActionsScreen";

    public AddActionsFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Outlet']")
    public WebElement outletButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='On']")
    public WebElement onRadioButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/title_menu_2")
    public WebElement doneButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/save_menu")
    public WebElement saveButton;

    public void verifyAndClickOutletButton() {
        Logger.logStep("Verify Outlet Button is displayed");
        outletButton.isDisplayed();
        Logger.logStep("Click on Outlet Button");
        outletButton.click();
    }

    public void verifyAndClickOnRadioButton() {
        Logger.logStep("Verify On Radio Button is displayed");
        onRadioButton.isDisplayed();
        Logger.logStep("Click on Radio Button");
        onRadioButton.click();
    }

    public void verifyAndClickDoneButton() {
        Logger.logStep("Verify Done Button is displayed");
        doneButton.isDisplayed();
        Logger.logStep("Click on Done Button");
        doneButton.click();
    }

    public void verifyAndClickSaveButton() {
        Logger.logStep("Verify Save Button is displayed");
        saveButton.isDisplayed();
        Logger.logStep("Click on Save Button");
        saveButton.click();
    }
}
