package page.fragment.devices;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.AssertJUnit.assertTrue;
import static utility.Events.scrollTo;

public class DeviceDetailFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "DeviceDetailScreen";

    public DeviceDetailFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Outlet']")
    public WebElement outletTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Motion Sensor']")
    public WebElement motionSensorTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Multipurpose Sensor']")
    public WebElement multiPurposeSensorTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Aeotec Siren (Gen 5)']")
    public WebElement sirenTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Water Leak Sensor']")
    public WebElement waterLeakSensorTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Sengled Element Classic']")
    public WebElement sengledBulbTile;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Home Hub']")
    public WebElement homeHubTile;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/dashboard_device_icon")
    public WebElement deviceIcon;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='On']")
    public WebElement onStatus;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='No motion']")
    public WebElement noMotionStatus;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Off']")
    public WebElement offStatus;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Closed']")
    public WebElement closedStatus;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Dry']")
    public WebElement dryStatus;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Connected']")
    public WebElement conntectedStatus;

    public void verifyOutletTileIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Outlet Tile is displayed");
        Logger.logStep("Verify Outlet Tile is displayed");
        assertTrue(outletTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(onStatus.isDisplayed());
    }

    public void verifyMotionSensorTileIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Motion Sensor Tile is displayed");
        Logger.logStep("Verify Motion Sensor Tile is displayed");
        assertTrue(motionSensorTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(noMotionStatus.isDisplayed());
    }

    public void verifyMultiPurposeSensorTileIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Multipurpose Sensor Tile is displayed");
        Logger.logStep("Verify Multipurpose Sensor Tile is displayed");
        assertTrue(multiPurposeSensorTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(closedStatus.isDisplayed());
    }

    public void verifyAeoticSirenTileIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Aeotec Siren (Gen 5) Tile is displayed");
        Logger.logStep("Verify Aeotec Siren (Gen 5) Tile is displayed");
        assertTrue(sirenTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(offStatus.isDisplayed());
    }

    public void verifyWaterLeakSensorTileIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Water Leak Sensor Tile is displayed");
        Logger.logStep("Verify Water Leak Sensor Tile is displayed");
        assertTrue(waterLeakSensorTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(dryStatus.isDisplayed());
    }

    public void verifySengledBulbTileIsPresent() {
        scrollTo("Sengled Element Classic");
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Sengled Bulb Tile is displayed");
        Logger.logStep("Verify Sengled Bulb Tile is displayed");
        assertTrue(sengledBulbTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(offStatus.isDisplayed());
    }

    public void verifyHomeHubTileIsPresent() {
        //scrollTo("Home Hub");
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Home Hub Tile is displayed");
        Logger.logStep("Verify Home Hub Tile is displayed");
        assertTrue(homeHubTile.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Icon Info is displayed");
        Logger.logStep("Verify Icon Info is displayed");
        assertTrue(deviceIcon.isDisplayed());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Status Info is displayed");
        Logger.logStep("Verify Status Info is displayed");
        assertTrue(conntectedStatus.isDisplayed());
    }
}
