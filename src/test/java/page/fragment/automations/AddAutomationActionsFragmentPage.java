package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AddAutomationActionsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public AddAutomationActionsFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add actions']")
    public WebElement addActionPageTitle;

    @AndroidFindBy(accessibility = "Information")
    public WebElement infoButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Notify me']")
    public WebElement notifyMeTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Outlet']")
    public WebElement outletTile;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/notification_message")
    public WebElement notificationMessageBox;

    public void verifyAddActionPageTitleIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Action Page Title is displayed");
        Logger.logStep("Verify Add Action Page Title is displayed");
        addActionPageTitle.isDisplayed();
    }

    public void verifyAndClickInfoButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Info Button is displayed");
        Logger.logStep("Verify Info Button is displayed");
        infoButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Info Button");
        Logger.logStep("Click on Info Button");
        infoButton.click();
    }

    public void verifyAndClickNotifyMeTile() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Notify Me Tile is displayed");
        Logger.logStep("Verify Notify Me Tile is displayed");
        notifyMeTile.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Notify Me Tile");
        Logger.logStep("Click on Notify Me Tile");
        notifyMeTile.click();
    }

    public void verifyAndClickOutletTile() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet Tile is displayed");
        Logger.logStep("Verify Outlet Tile is displayed");
        outletTile.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Outlet Tile");
        Logger.logStep("Click on Outlet Tile");
        outletTile.click();
    }

    public void verifyAndClickNotificationBox() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Notification Box is displayed");
        Logger.logStep("Verify Notification Box is displayed");
        notificationMessageBox.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Notification Box Tile");
        Logger.logStep("Click on Notification Box Tile");
        notificationMessageBox.click();
    }

    public void addNotificationMessage (String text) {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Adding \"" + text + "\" Notification Message");
        Logger.logStep("Adding \"" + text + "\" Notification Message");
        notificationMessageBox.sendKeys(text);
        driver.hideKeyboard();
    }
}
