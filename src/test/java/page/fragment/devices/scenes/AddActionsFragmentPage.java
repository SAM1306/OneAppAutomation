package page.fragment.devices.scenes;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
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
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet Button is displayed");
        Logger.logStep("Verify Outlet Button is displayed");
        outletButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Outlet Button");
        Logger.logStep("Click on Outlet Button");
        outletButton.click();
    }

    public void verifyAndClickOnRadioButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify On Radio Button is displayed");
        Logger.logStep("Verify On Radio Button is displayed");
        onRadioButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Radio Button");
        Logger.logStep("Click on Radio Button");
        onRadioButton.click();
    }

    public void verifyAndClickDoneButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Done Button is displayed");
        Logger.logStep("Verify Done Button is displayed");
        doneButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Done Button");
        Logger.logStep("Click on Done Button");
        doneButton.click();
    }

    public void verifyAndClickSaveButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Save Button is displayed");
        Logger.logStep("Verify Save Button is displayed");
        saveButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Save Button");
        Logger.logStep("Click on Save Button");
        saveButton.click();
        Thread.sleep(4000L);
    }
}
