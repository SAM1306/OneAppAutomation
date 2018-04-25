package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class MoreOptionsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "MoreOptionsScreen";

    public MoreOptionsFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Settings']")
    public WebElement settingsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Manage Dashboard']")
    public WebElement manageDashbaord;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Delete']")
    public WebElement deleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Help']")
    public WebElement helpButton;

    public void verifyAndClickSettingssButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Settings Button is displayed");
        Logger.logStep("Verify Settings Button is displayed");
        settingsButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Settings Button");
        Logger.logStep("Click on Settings Button");
        settingsButton.click();
    }

    public void verifyAndClickHelpButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Help Button is displayed");
        Logger.logStep("Verify Help Button is displayed");
        helpButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Help Button");
        Logger.logStep("Click on Help Button");
        helpButton.click();
    }

    public void verifyAndClickDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify More Options Button is displayed");
        Logger.logStep("Verify More Options Button is displayed");
        deleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
    }

    public void verifyAndClickManageDashboardButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Manage Dashboard Button is displayed");
        Logger.logStep("Verify Manage Dashboard Button is displayed");
        manageDashbaord.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Manage Dashboard Button");
        Logger.logStep("Click on Manage Dashboard Button");
        manageDashbaord.click();
    }
}
