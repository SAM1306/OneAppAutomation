package page.fragment.devices.scenes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

public class AddSceneFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddSceneScreen";

    public AddSceneFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/edit_mode_name")
    public WebElement sceneNameTextBox;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/edit_mode_add_action_button")
    public WebElement addActionsButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/add_edit_mode_delete_mode_button")
    public WebElement deleteButton;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement confirmDeleteButton;

    @AndroidFindBy(accessibility = "Remove")
    public WebElement removeButton;

    public void verifyAndClickAddActionsButton() {
        Logger.logStep("Verify Add Actions Button is displayed");
        addActionsButton.isDisplayed();
        Logger.logStep("Click on Add Actions Button");
        addActionsButton.click();
    }

    public void verifyAndClickDeleteButton() {
        Logger.logStep("Verify Delete Button is displayed");
        deleteButton.isDisplayed();
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
    }

    public void verifyAndClickConfirmDeleteButton() {
        Logger.logStep("Verify Confirm Delete Button is displayed");
        confirmDeleteButton.isDisplayed();
        Logger.logStep("Click on Confirm Delete Button");
        confirmDeleteButton.click();
    }

    public void verifyAndClickRemoveButton() {
        Logger.logStep("Verify Remove Button is displayed");
        removeButton.isDisplayed();
        Logger.logStep("Click on Remove Button");
        removeButton.click();
    }

    public void verifyAndClickSceneNameTextBox() {
        Logger.logStep("Verify Scene Name Text Box is displayed");
        sceneNameTextBox.isDisplayed();
        Logger.logStep("Click on Scene Name Text Box");
        sceneNameTextBox.click();
    }

    public void addSceneName (String text) {
        Logger.logStep("Adding \"" + text + "\" Scene Name");
        sceneNameTextBox.sendKeys(text);
        driver.hideKeyboard();
    }
}
