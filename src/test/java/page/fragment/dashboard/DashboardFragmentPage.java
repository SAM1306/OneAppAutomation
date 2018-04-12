package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class DashboardFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public DashboardFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "SmartThings")
    public WebElement smartthingsLogo;

    @AndroidFindBy(accessibility = "More options")
    public WebElement moreOptions;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/moving_box")
    public WebElement creatingSceneTiles;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/sc_main_location_image")
    public WebElement homeTile;


    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mainLabel")
    public WebElement addDevicesTile;


    @AndroidFindBy(accessibility = "Supported devices Button")
    public WebElement supportedDevicesTiles;

    @AndroidFindBy(id = "com.31 `samsung.android.oneconnect:id/dummyLayout")
    public WebElement howToUseTile;

    @AndroidFindBy(accessibility = "Scene information")
    public WebElement sceneInfoButton;

    public void verifySmartthingsLogoIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Smartthings Logo is displayed");
        Logger.logStep("Verify Smartthings Logo is displayed");
        smartthingsLogo.isDisplayed();
    }

    public void verifyAndClickSupportedDevciesTile() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Supported Devices Tile is displayed");
        Logger.logStep("Verify Supported Devices Tile is displayed");
        supportedDevicesTiles.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Supported Devices Tile");
        Logger.logStep("Click on Supported Devices Tile");
        supportedDevicesTiles.click();
        Thread.sleep(6000L);
    }

    public void verifyAndClickMoreOptionsButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify More Options Button is displayed");
        Logger.logStep("Verify More Options Button is displayed");
        moreOptions.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on More Options Button");
        Logger.logStep("Click on More Options Button");
        moreOptions.click();
    }

    public void verifySceneInfoButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Scene Info Button is displayed");
        Logger.logStep("Verify Scene Info Button is displayed");
        assertTrue(sceneInfoButton.isDisplayed());
    }

    public void clickSceneInfoButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Scene Info Button");
        Logger.logStep("Click on Scene Info Button");
        sceneInfoButton.click();
        Thread.sleep(4000L);
    }
}

