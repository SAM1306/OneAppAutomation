package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class SmartLightsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";
    private static final String OUTLET = "Outlet";
    private static final String MOTION = "Motion";

    public SmartLightsFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'New Lighting Automation')]")
    public WebElement newLightingAutomationButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Which devices do you want to control?, Tap to set']")
    public WebElement whichDevicesToControlButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Outlet, Not Checked']")
    public WebElement outletButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Select trigger, Tap to set']")
    public WebElement selectTriggerButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Which motion sensors?, Tap to set']")
    public WebElement whichMotionSensorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Motion, Not Checked']")
    public WebElement motionButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Motion Sensor, Not Checked']")
    public WebElement motionSensorButton;

    public void verifyAndClickNewLightingAutomationButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify new Lighting Automation Button is displayed");
        Logger.logStep("Verify new Lighting Automation Button is displayed");
        Thread.sleep(4000L);
        newLightingAutomationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on new Lighting Automation Button");
        Logger.logStep("Click on new Lighting Automation Button");
        newLightingAutomationButton.click();
    }

    public void verifyAndClickWhichDevicesToControlButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Which devices to control Button is displayed");
        Logger.logStep("Verify Which devices to control Button is displayed");
        whichDevicesToControlButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Which devices to control Button");
        Logger.logStep("Click on Which devices to control Button");
        whichDevicesToControlButton.click();
    }

    public void verifyAndClickOutletButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet Button is displayed");
        Logger.logStep("Verify Outlet Button is displayed");
        outletButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Outlet Button");
        Logger.logStep("Click on Outlet Button");
        outletButton.click();
    }

    public void clickDeviceButton(String buttonName) {
        Logger.logStep("Click on " + buttonName + " Button");
        switch(buttonName) {
            case OUTLET : {
                ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet Button is displayed");
                Logger.logStep("Verify Outlet Button is displayed");
                outletButton.isDisplayed();
                ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Outlet Button");
                Logger.logStep("Click on Outlet Button");
                outletButton.click();
                return;
            }
            default: {
                throw new IllegalArgumentException("Button " + buttonName + " not supported");
            }
        }
    }

    public void verifyAndSelectTriggerButton(String triggerButton) {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Select Trigger Button is displayed");
        Logger.logStep("Verify Select Trigger Button is displayed");
        selectTriggerButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Select Trigger Button");
        Logger.logStep("Click on Select Trigger Button");
        selectTriggerButton.click();
        switch(triggerButton){
            case MOTION : {
                ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Motion Button is displayed");
                Logger.logStep("Verify Motion Button is displayed");
                motionButton.isDisplayed();
                ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Motion Button");
                Logger.logStep("Click on Motion Button");
                motionButton.click();
                return;
            }
        }
    }

    public void verifyAndClickMotionButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Motion Button is displayed");
        Logger.logStep("Verify Motion Button is displayed");
        motionButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Motion Button");
        Logger.logStep("Click on Motion Button");
        motionButton.click();
    }

    public void verifyAndClickWhichMotionButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Which Motion Sensors Button is displayed");
        Logger.logStep("Verify Which Motion Sensors Button is displayed");
        whichMotionSensorButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Which Motion Sensors Button");
        Logger.logStep("Click on Which Motion Sensors Button");
        whichMotionSensorButton.click();
    }

    public void verifyAndClickMotionSensorButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Motion Sensor Button is displayed");
        Logger.logStep("Verify Motion Sensor Button is displayed");
        motionSensorButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Motion Sensor Button");
        Logger.logStep("Click on Motion Sensor Button");
        motionSensorButton.click();
    }
}