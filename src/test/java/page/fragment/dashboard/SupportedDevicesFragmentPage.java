package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class SupportedDevicesFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SupportedDevicesScreen";

    public SupportedDevicesFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/actionbar_title")
    public WebElement supportedDeviceTitle;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/easysetup_search_view")
    public WebElement searchBar;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='TV']")
    public WebElement tVButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='AV']")
    public WebElement aVButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Air conditioner']")
    public WebElement airConditionerButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Washer']")
    public WebElement washerButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Robot vacuum']")
    public WebElement robotVacuumButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Refrigerator']")
    public WebElement refrigeratorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Oven']")
    public WebElement ovenButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Range']")
    public WebElement rangeButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Cooktop']")
    public WebElement cookTopButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Wi-Fi/Hub']")
    public WebElement wiFiHubButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Blu-ray Player']")
    public WebElement bluRayPlayerButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Hubs']")
    public WebElement hubsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Moisture sensor']")
    public WebElement moistureSensorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Motion sensor']")
    public WebElement motionSensorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Multi-functional sensor']")
    public WebElement multiFunctionalSensorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Open/closed sensor']")
    public WebElement openClosedSensorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Presence sensor']")
    public WebElement presenceSensorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='ADT security devices']")
    public WebElement adtSecurityDevicesButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Camera']")
    public WebElement cameraButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Doorbell']")
    public WebElement doorBellButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Light bulb']")
    public WebElement lightBulbButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Lock']")
    public WebElement lockButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Outlet']")
    public WebElement outletButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smoke detector/Siren']")
    public WebElement smokeDetectorButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Speaker']")
    public WebElement speakerButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Switch/dimmer']")
    public WebElement switchDimmerButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Thermostat']")
    public WebElement thermostatButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Valve']")
    public WebElement valveButton;

    public void verifySearchBarIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Search Bar is displayed");
        Logger.logStep("Verify Search Bar is displayed");
        assertTrue(searchBar.isDisplayed());
    }

    public void verifyTVButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify TV Button is displayed");
        Logger.logStep("Verify TV Button is displayed");
        assertTrue(tVButton.isDisplayed());
    }

    public void verifyAVButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify AV Button is displayed");
        Logger.logStep("Verify AV Button is displayed");
        assertTrue(aVButton.isDisplayed());
    }

    public void verifyAirConditionerButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Air Conditioner Button is displayed");
        Logger.logStep("Verify Air Conditioner Button is displayed");
        assertTrue(airConditionerButton.isDisplayed());
    }

    public void verifyWasherButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Washer Button is displayed");
        Logger.logStep("Verify Washer Button is displayed");
        assertTrue(washerButton.isDisplayed());
    }

    public void verifyRobotVacuumButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Robot Vacuum Button is displayed");
        Logger.logStep("Verify Robot Vacuum Button is displayed");
        assertTrue(robotVacuumButton.isDisplayed());
    }

    public void verifyRefrigeratorButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Refrigerator Button is displayed");
        Logger.logStep("Verify Refrigerator Button is displayed");
        assertTrue(refrigeratorButton.isDisplayed());
    }

    public void verifyOvenButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Oven Button is displayed");
        Logger.logStep("Verify Oven Button is displayed");
        assertTrue(ovenButton.isDisplayed());
    }

    public void verifyRangeButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Range Button is displayed");
        Logger.logStep("Verify Range Button is displayed");
        assertTrue(rangeButton.isDisplayed());
    }

    public void verifyCooktopButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Cooktop Button is displayed");
        Logger.logStep("Verify Cooktop Button is displayed");
        assertTrue(cookTopButton.isDisplayed());
    }

    public void verifyWiFiHubButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Wi-Fi Hub Button is displayed");
        Logger.logStep("Verify Wi-Fi Hub Button is displayed");
        assertTrue(wiFiHubButton.isDisplayed());
    }

    public void verifyBluRayButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Blu-ray Player Button is displayed");
        Logger.logStep("Verify Blu-ray Player Button is displayed");
        assertTrue(bluRayPlayerButton.isDisplayed());
    }

    public void verifyHubsButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Hubs Button is displayed");
        Logger.logStep("Verify Hubs Button is displayed");
        assertTrue(hubsButton.isDisplayed());
    }

    public void verifyMoistureSensorButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Moisture Sensor Button is displayed");
        Logger.logStep("Verify Moisture Sensor Button is displayed");
        assertTrue(moistureSensorButton.isDisplayed());
    }

    public void verifyMotionSensorButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Motion Sensor Button is displayed");
        Logger.logStep("Verify Motion Sensor Button is displayed");
        assertTrue(motionSensorButton.isDisplayed());
    }

    public void verifyMultiFunctionalSensorButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Multi Functional Sensor Button is displayed");
        Logger.logStep("Verify Multi Functional Sensor Button is displayed");
        assertTrue(multiFunctionalSensorButton.isDisplayed());
    }

    public void verifyOpenClosedSensorButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Open Closed Sensor Button is displayed");
        Logger.logStep("Verify Open Closed Sensor Button is displayed");
        assertTrue(openClosedSensorButton.isDisplayed());
    }

    public void verifyPresenceSensorButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Presence Sensor Button is displayed");
        Logger.logStep("Verify Presence Sensor Button is displayed");
        assertTrue(presenceSensorButton.isDisplayed());
    }

    public void verifyADTSecurityDevicesButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify ADT Security Devices Button is displayed");
        Logger.logStep("Verify ADT Security Devices Button is displayed");
        assertTrue(adtSecurityDevicesButton.isDisplayed());
    }

    public void verifyCameraButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Camera Button is displayed");
        Logger.logStep("Verify Camera Button is displayed");
        assertTrue(cameraButton.isDisplayed());
    }

    public void verifyDoorbellButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Doorbell Button is displayed");
        Logger.logStep("Verify Doorbell Button is displayed");
        assertTrue(doorBellButton.isDisplayed());
    }

    public void verifyLightBulbButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Light Bulb Button is displayed");
        Logger.logStep("Verify Light Bulb Button is displayed");
        assertTrue(lightBulbButton.isDisplayed());
    }

    public void verifyLockButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Lock Button is displayed");
        Logger.logStep("Verify Lock Button is displayed");
        assertTrue(lockButton.isDisplayed());
    }

    public void verifyOutletButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet Button is displayed");
        Logger.logStep("Verify Outlet Button is displayed");
        assertTrue(outletButton.isDisplayed());
    }

    public void verifySmokeDetectorSirenButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Smoke Detector/Siren Button is displayed");
        Logger.logStep("Verify Smoke Detector/Siren Button is displayed");
        assertTrue(smokeDetectorButton.isDisplayed());
    }

    public void verifySpeakerButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Speaker Button is displayed");
        Logger.logStep("Verify Speaker Button is displayed");
        assertTrue(speakerButton.isDisplayed());
    }

    public void verifySwitchDimmerButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Switch/Dimmer Button is displayed");
        Logger.logStep("Verify Switch/Dimmer Button is displayed");
        assertTrue(switchDimmerButton.isDisplayed());
    }

    public void verifyThermostatButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Thermostat Button is displayed");
        Logger.logStep("Verify Thermostat Button is displayed");
        assertTrue(thermostatButton.isDisplayed());
    }

    public void verifyValveButtonIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Valve Button is displayed");
        Logger.logStep("Verify Valve Button is displayed");
        assertTrue(valveButton.isDisplayed());
    }
}
