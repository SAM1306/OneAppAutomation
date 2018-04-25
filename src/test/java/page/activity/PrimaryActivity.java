package page.activity;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class PrimaryActivity extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public PrimaryActivity(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Dashboard']")
    public WebElement dashboardButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Devices' and @resource-id='com.samsung.android.oneconnect:id/tab_text']")
    public WebElement devicesButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Automations']")
    public WebElement automationsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Delete']")
    public WebElement popUpDeleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='OK']")
    public WebElement okButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Close']")
    public WebElement closeButton;

    public void getDashboardButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Dashboard Button is displayed");
        Logger.logStep("Verify Dashboard Button is displayed");
        dashboardButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Dashboard Button");
        Logger.logStep("Click on Dashboard Button");
        dashboardButton.click();
        Thread.sleep(4000L);
    }

    public void getDevicesButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Device Button is displayed");
        Logger.logStep("Verify Devices Button is displayed");
        devicesButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Devices Button");
        Logger.logStep("Click on Devices Button");
        devicesButton.click();
        Thread.sleep(4000L);
    }

    public void getAutomationsButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Automations Button is displayed");
        Logger.logStep("Verify Automations Button is displayed");
        automationsButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Automations Button");
        Logger.logStep("Click on Automations Button");
        automationsButton.click();
        Thread.sleep(4000L);
    }

    public void verifyAndClickPopUpDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Pop Up Delete Button is displayed");
        Logger.logStep("Verify Pop Up is displayed");
        popUpDeleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Pop Up Delete Button");
        Logger.logStep("Click on Pop Up Button");
        popUpDeleteButton.click();
    }

    public void verifyAndClickOKButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on OK Button");
        Logger.logStep("Click on OK Button");
        okButton.click();
    }

    public void verifyAndClickCloseButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Close Button");
        Logger.logStep("Click on Close Button");
        closeButton.click();
    }
}
