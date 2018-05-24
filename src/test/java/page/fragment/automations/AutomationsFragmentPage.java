package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AutomationsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public AutomationsFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_textview_title")
    public WebElement automationsTitle;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_add_rule")
    public WebElement addAutomationButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_how_to_use")
    public WebElement howToUseAutomations;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    public WebElement smartHomeMonitorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add']")
    public WebElement addButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_layout_item")
    public WebElement customAutomationButton;

    @AndroidFindBy(accessibility = "More options")
    public WebElement moreOptionsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Delete']")
    public WebElement deleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Lighting']")
    public WebElement smartLightingButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Delete']")
    public WebElement confirmDeleteButton;

    public void verifyAutomationPageTitleIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Automation Page Title is displayed");
        Logger.logStep("Verify Automation Page Title is displayed");
        automationsTitle.isDisplayed();
    }

    public void verifyAndClickAddAutomationButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Automation Button is displayed");
        Logger.logStep("Verify Add Automation Button is displayed");
        if (isAddAutomationPresent()){
        addAutomationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Automation Button");
        Logger.logStep("Click on Add Automation Button");
        addAutomationButton.click();
            Thread.sleep(4000L);
        }else{
            ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Button");
            Logger.logStep("Click on Add Button");
            addButton.click();
            Thread.sleep(4000L);
        }
    }

        public boolean isAddAutomationPresent() {
            try {
                addAutomationButton.isDisplayed();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

    public void verifyAndClickSHMButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM Button is displayed");
        Logger.logStep("Verify SHM Button is displayed");
        smartHomeMonitorButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on SHM Button");
        Logger.logStep("Click on SHM Button");
        smartHomeMonitorButton.click();
    }

    public void verifyAndClickCustomAutomationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Custom Automation Button is displayed");
        Logger.logStep("Verify Custom Automation Button is displayed");
        customAutomationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Custom Automation Button");
        Logger.logStep("Click on Custom Automation Button");
        customAutomationButton.click();
    }

    public void verifyAndClickMoreOptionstButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify More Options Button is displayed");
        Logger.logStep("Verify More Options Button is displayed");
        moreOptionsButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on More Options Button");
        Logger.logStep("Click on More Options Button");
        moreOptionsButton.click();
    }

    public void verifyAndClickDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Delete Button is displayed");
        Logger.logStep("Verify Delete Button is displayed");
        deleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
    }

    public void verifyAndClickSmartLightingButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Smart Lighting Button is displayed");
        Logger.logStep("Verify Smart Lighting Button is displayed");
        smartLightingButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Smart Lighting Button");
        Logger.logStep("Click on Smart Lighting Button");
        smartLightingButton.click();
    }

    public void verifyAndClicConfirmkDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Confirm Delete Button is displayed");
        Logger.logStep("Verify Confirm Delete Button is displayed");
        confirmDeleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Confirm Delete Button");
        Logger.logStep("Click on Confirm Delete Button");
        confirmDeleteButton.click();
    }

    public void verifyAddAutomationButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add automation Button is displayed");
        Logger.logStep("Verify Add Automation Button is displayed");
        addAutomationButton.isDisplayed();
    }

    public void verifySmartLightingIsPresent(){
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Smart Lighting Button is displayed");
        Logger.logStep("Verify Smart Lighting Button is displayed");
        smartLightingButton.isDisplayed();
    }
}
