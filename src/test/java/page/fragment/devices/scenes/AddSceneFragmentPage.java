package page.fragment.devices.scenes;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
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
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Actions Button is displayed");
        Logger.logStep("Verify Add Actions Button is displayed");
        addActionsButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Actions Button");
        Logger.logStep("Click on Add Actions Button");
        addActionsButton.click();
    }

    public void verifyAndClickDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Delete Button is displayed");
        Logger.logStep("Verify Delete Button is displayed");
        deleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
    }

    public void verifyAndClickConfirmDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Confirm Delete Button is displayed");
        Logger.logStep("Verify Confirm Delete Button is displayed");
        confirmDeleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Confirm Delete Button");
        Logger.logStep("Click on Confirm Delete Button");
        confirmDeleteButton.click();
    }

    public void verifyAndClickRemoveButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Remove Button is displayed");
        Logger.logStep("Verify Remove Button is displayed");
        removeButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Remove Button");
        Logger.logStep("Click on Remove Button");
        removeButton.click();
    }

    public void verifyAndClickSceneNameTextBox() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Scene Name Text Box is displayed");
        Logger.logStep("Verify Scene Name Text Box is displayed");
        sceneNameTextBox.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Scene Name Text Box");
        Logger.logStep("Click on Scene Name Text Box");
        sceneNameTextBox.click();
    }

    public void addSceneName (String text) {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Adding \"" + text + "\" Scene Name");
        Logger.logStep("Adding \"" + text + "\" Scene Name");
        sceneNameTextBox.sendKeys(text);
        driver.hideKeyboard();
    }
}
