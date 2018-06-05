package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;
import utility.events.Events;
import utility.events.EventsFactory;

import static org.testng.Assert.assertTrue;

public class AddAutomationFragmentPage extends BasePage {

    private Events events = EventsFactory.getEvents(driver);

    private static final String SCREEN_NAME = "AddAutomationScreen";
    private String smartLightsApp = "Smart Lights";
    private static final String SMART_HOME_MONITOR = "Smart Home Monitor";
    private static final String SMART_LIGHTS = "smartLights";

    public AddAutomationFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    @iOSFindBy(accessibility = "Smart Home Monitor")
    public WebElement smartHomeMonitor;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget." +
            "LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SmartThings\"])[1]")
    public WebElement smartHomeMonitorDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Monitor your home for intrusions.']")
    @iOSFindBy(accessibility = "Monitor your home for intrusions.")
    public WebElement smartHomeMonitorAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Severe Weather Alert']")
    @iOSFindBy(accessibility = "Severe Weather Alert")
    public WebElement severeWeatherAlert;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget." +
            "LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SmartThings\"])[2]")
    public WebElement severeWeatherAlertDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Get a push notification when severe " +
            "weather is in your area.']")
    @iOSFindBy(accessibility = "Get a push notification when severe weather is in your area.")
    public WebElement severeWeatherAlertAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Enhanced Auto Lock Door']")
    @iOSFindBy(accessibility = "Enhanced Auto Lock Door")
    public WebElement enhancedAutoDoorLock;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Arnaud']")
    @iOSFindBy(accessibility = "Arnaud")
    public WebElement enhancedAutoDoorLockDeveloperInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Automatically locks a specific ')]")
    @iOSFindBy(accessibility = "Automatically locks a specific door after X minutes when closed and unlocks " +
            "it when open after X seconds.")
    public WebElement enhancedAutoDoorLockAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Ready for Rain']")
    @iOSFindBy(accessibility = "Ready for Rain")
    public WebElement readyForRain;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='brian@bevey.org']")
    @iOSFindBy(accessibility = "brian@bevey.org")
    public WebElement readyForRainDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Warn if doors or windows are open when " +
            "inclement weather is approaching.']")
    @iOSFindBy(accessibility = "Warn if doors or windows are open when inclement weather is approaching.")
    public WebElement readyForRainAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Lights']")
    @iOSFindBy(accessibility = "Smart Lights")
    public WebElement smartLights;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget." +
            "LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SmartThings\"])[3]")
    public WebElement smartLightsDeveloperInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Controls your lights and switches based on')]")
    @iOSFindBy(accessibility = "Controls your lights and switches based on a variety of inputs including motion," +
            " open/close, presence, mode changes, specific times, sunrise/sunset, and more.")
    public WebElement smartLightsAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Color Coordinator']")
    @iOSFindBy(accessibility = "Color Coordinator")
    public WebElement colorCoordinator;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Michael Struck']")
    @iOSFindBy(accessibility = "Michael Struck")
    public WebElement colorCoordinatorDeveloperInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Ties multiple colored ')]")
    @iOSFindBy(accessibility = "Ties multiple colored lights to one specific light's settings")
    public WebElement colorCoordinatorAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Keep me Cozy']")
    @iOSFindBy(accessibility = "Keep me Cozy")
    public WebElement keepMeCozy;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android." +
            "widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.TextView[2]")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SmartThings\"])[2]")
    public WebElement keepMeCozyDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Enables you to pick an alternative " +
            "temperature sensor in a separate space from the thermostat. Focuses on making you comfortable where you " +
            "are spending your time rather than where the thermostat is located.']")
    @iOSFindBy(accessibility = "Enables you to pick an alternative temperature sensor in a separate space from the " +
            "thermostat. Focuses on making you comfortable where you are spending your time rather " +
            "than where the thermostat is located.")
    public WebElement keepMeCozyAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Thermostat Mode Director']")
    @iOSFindBy(accessibility = "Thermostat Mode Director")
    public WebElement thermostatModeDirector;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Tim Slagle']")
    @iOSFindBy(accessibility = "Tim Slagle")
    public WebElement thermostatModeDirectorDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Changes mode of your thermostat based on " +
            "the temperature range of a specified temperature sensor and shuts off the thermostat if any windows/doors " +
            "are open.']")
    @iOSFindBy(accessibility = "Changes mode of your thermostat based on the temperature range of a " +
            "specified temperature sensor and shuts off the thermostat if any windows/doors are open.")
    public WebElement thermostatModeDirectorAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Windows']")
    @iOSFindBy(accessibility = "Smart Windows")
    public WebElement smartWindows;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Eric Gideon']")
    @iOSFindBy(accessibility = "Eric Gideon")
    public WebElement smartWindowsDeveloperInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Compares two temperatures – indoor vs outdoor')]")
    @iOSFindBy(accessibility = "Compares two temperatures – indoor vs outdoor, for example – then sends an alert " +
            "if windows are open (or closed!). If you don't use an external temperature device, " +
            "your location will be used instead.")
    public WebElement smartWindowsAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Speaker Companion']")
    @iOSFindBy(accessibility = "Speaker Companion")
    public WebElement speakerCompanion;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android." +
            "widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SmartThings\"])[3]")
    public WebElement speakerCompanionDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Control your speaker, play a sound, a " +
            "custom message when an event occurs or the system mode changes.']")
    @iOSFindBy(accessibility = "Control your speaker, play a sound, a custom message when an event occurs" +
            " or the system mode changes.")
    public WebElement speakerCompanionAppInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Door Knocker']")
    @iOSFindBy(accessibility = "Door Knocker")
    public WebElement doorKnocker;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='brian@bevey.org']")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"brian@bevey.org\"])[2]")
    public WebElement doorKnockerDeveloperInfo;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Alert if door is knocked, but not opened.']")
    @iOSFindBy(accessibility = "Alert if door is knocked, but not opened.")
    public WebElement doorKnockerAppInfo;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_recommended_add_button")
    public WebElement customAutomationButton;

    public void verifySHMIsCreated() {
        ExtentTestManager.getTest().setDescription("Verify SHM Button is displayed");
        Logger.logStep("Verify SHM Button is displayed");
        assertTrue(smartHomeMonitor.isDisplayed());
    }

    public void verifySHMButtonIsPresent() {
        ExtentTestManager.getTest().setDescription("Verify SHM Button is displayed");
        Logger.logStep("Verify SHM Button is displayed");
        assertTrue(smartHomeMonitor.isDisplayed());
        ExtentTestManager.getTest().setDescription("Verify SHM Developer Info is displayed");
        Logger.logStep("Verify SHM Developer Info is displayed");
        assertTrue(smartHomeMonitorDeveloperInfo.isDisplayed());
        ExtentTestManager.getTest().setDescription("Verify SHM App Info is displayed");
        Logger.logStep("Verify SHM App Info is displayed");
        assertTrue(smartHomeMonitorAppInfo.isDisplayed());
    }

    public void verifySevereWeatherAlertIsPresent() {
        Logger.logStep("Verify Severe Weather Alert Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Severe Weather Alert Button is displayed");
        assertTrue(severeWeatherAlert.isDisplayed());
        Logger.logStep("Verify Severe Weather Alert Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Severe Weather Alert Developer Info is displayed");
        assertTrue(severeWeatherAlertDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Severe Weather Alert App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Severe Weather Alert App Info is displayed");
        assertTrue(severeWeatherAlertAppInfo.isDisplayed());
    }

    public void verifyEnhancedAutoDoorLockIsPresent() {
        Logger.logStep("Verify Enhanced Auto Door Lock Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Enhanced Auto Door Lock Button is displayed");
        assertTrue(enhancedAutoDoorLock.isDisplayed());
        Logger.logStep("Verify Enhanced Auto Door Lock Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Enhanced Auto Door Lock Developer Info is displayed");
        assertTrue(enhancedAutoDoorLockDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Enhanced Auto Door Lock App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Enhanced Auto Door Lock App Info is displayed");
//        assertTrue(enhancedAutoDoorLockAppInfo.isDisplayed());
    }

    public void verifyReadyForRainIsPresent() {
        Logger.logStep("Verify Ready For Rain Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Ready For Rain Button is displayed");
        //events.scrollTo("Ready for Rain");
        TouchAction ta = new TouchAction(driver);
        ta.press(100, 100).moveTo(readyForRain).release();
        ta.perform();
        assertTrue(readyForRain.isDisplayed());
        Logger.logStep("Verify Ready For Rain Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Ready For Rain Developer Info is displayed");
        assertTrue(readyForRainDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Ready For Rain App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Ready For Rain App Info is displayed");
        assertTrue(readyForRainAppInfo.isDisplayed());
    }

    public void verifySmartLightsIsPresent() {
        events.scrollTo("Smart Lights");
        Logger.logStep("Verify Smart Lights Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Smart Lights Button is displayed");
        events.scrollTo("Smart Lights");
        assertTrue(smartLights.isDisplayed());
        Logger.logStep("Verify Smart Lights Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Smart Lights Developer Info is displayed");
        assertTrue(smartLightsDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Smart Lights App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Smart Lights App Info is displayed");
        assertTrue(smartLightsAppInfo.isDisplayed());
    }

    public void verifyColorCoordinatorIsPresent() {
        TouchAction ta = new TouchAction(driver);
        ta.press(100, 100).moveTo(smartLights).release();
        ta.perform();
      //  events.scrollTo("Smart Lights");
        Logger.logStep("Verify Color Coordinator Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Color Coordinator Button is displayed");
        assertTrue(colorCoordinator.isDisplayed());
        Logger.logStep("Verify Color Coordinator Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Color Coordinator Developer Info is displayed");
        assertTrue(colorCoordinatorDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Color Coordinator App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Color Coordinator App Info is displayed");
        assertTrue(colorCoordinatorAppInfo.isDisplayed());
    }

    public void verifyKeepMeCozyIsPresent() {
        events.scrollTo("Thermostat Mode Director");
        Logger.logStep("Verify Keep me Cozy Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Keep me Cozy Button is displayed");
        assertTrue(keepMeCozy.isDisplayed());
        Logger.logStep("Verify Keep me Cozy Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Keep me Cozy Developer Info is displayed");
        assertTrue(keepMeCozyDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Keep me Cozy App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Keep me Cozy App Info is displayed");
        assertTrue(keepMeCozyAppInfo.isDisplayed());
    }

    public void verifyThermostatModeDirectorIsPresent() {
        events.scrollTo("Thermostat Mode Director");
        Logger.logStep("Verify Thermostat Mode Director Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Thermostat Mode Director Button is displayed");
        assertTrue(thermostatModeDirector.isDisplayed());
        Logger.logStep("Verify Thermostat Mode Director Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Thermostat Mode Director Developer Info is displayed");
        assertTrue(thermostatModeDirectorDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Thermostat Mode Director App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Thermostat Mode Director App Info is displayed");
        assertTrue(thermostatModeDirectorAppInfo.isDisplayed());
    }

    public void verifySmartWindowsIsPresent() {
        events.scrollTo("Smart Windows");
        Logger.logStep("Verify Smart Windows Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Smart Windows Button is displayed");
        assertTrue(smartWindows.isDisplayed());
        Logger.logStep("Verify Smart Windows Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Smart Windows Developer Info is displayed");
        assertTrue(smartWindowsDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Smart Windows App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Smart Windows App Info is displayed");
    }

    public void verifySpeakerCompanionIsPresent() {
        events.scrollTo("Door Knocker");
        Logger.logStep("Verify Speaker Companion Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Speaker Companion Button is displayed");
        assertTrue(speakerCompanion.isDisplayed());
        Logger.logStep("Verify Speaker Companion Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Speaker Companion Developer Info is displayed");
        assertTrue(speakerCompanionDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Speaker Companion App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Speaker Companion App Info is displayed");
        assertTrue(speakerCompanionAppInfo.isDisplayed());
    }

    public void verifyDoorKnockerIsPresent() {
        Logger.logStep("Verify Door Knocker Button is displayed");
        ExtentTestManager.getTest().setDescription("Verify Door Knocker Button is displayed");
        assertTrue(doorKnocker.isDisplayed());
        Logger.logStep("Verify Door Knocker Developer Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Door Knocker Developer Info is displayed");
        assertTrue(doorKnockerDeveloperInfo.isDisplayed());
        Logger.logStep("Verify Door Knocker App Info is displayed");
        ExtentTestManager.getTest().setDescription("Verify Door Knocker App Info is displayed");
        assertTrue(doorKnockerAppInfo.isDisplayed());
    }

    public void clickSHMButton() throws InterruptedException {
        Logger.logStep("Click on SHM Button");
        smartHomeMonitor.click();
        Thread.sleep(6000L);
    }

    public SHMConfigurePage getSHMFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(smartHomeMonitor));
        return new SHMConfigurePage(driver);
    }

    public void verifyAndClickCustomAutomationButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Custom Automation Button is displayed");
        Logger.logStep("Verify Custom Automation Button is displayed");
        customAutomationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Custom Automation Button");
        Logger.logStep("Click on Custom Automation Button");
        customAutomationButton.click();
        Thread.sleep(2000L);
    }

    public void clickSmartLightigButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Smart Lights Button");
        Logger.logStep("Click on Smart Lights Button");
        events.scrollTo("Smart Lights");
        smartLights.click();
    }

    public void clickAutomationButton(String buttonName) throws InterruptedException {
        Logger.logStep("Click on " + buttonName + " Button");
        switch(buttonName) {
            case SMART_HOME_MONITOR: {
                ExtentTestManager.getTest().log(LogStatus.INFO, "Click on " + SMART_HOME_MONITOR + " Button");
                Logger.logStep("Click on " + SMART_HOME_MONITOR + " Button");
                smartHomeMonitor.click();
                Thread.sleep(6000L);
                return;
            }
            case SMART_LIGHTS : {
                ExtentTestManager.getTest().log(LogStatus.INFO, "Scroll to " + SMART_LIGHTS + " Button");
                Logger.logStep("Scroll to` " + SMART_LIGHTS + " Button");
                events.scrollTo(smartLightsApp);
                ExtentTestManager.getTest().log(LogStatus.INFO, "Click on " + SMART_LIGHTS + " Button");
                Logger.logStep("Click on " + SMART_LIGHTS + " Button");
                smartLights.click();
                Thread.sleep(6000L);
                return;
            }
            default: {
                throw new IllegalArgumentException("Button " + buttonName + " not supported");
            }
        }
    }
}
