package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
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

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/armed_away_button")
    public WebElement armedAwayButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/dis_armed_button")
    public WebElement disArmedButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/armed_stay_button")
    public WebElement armedStayButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    public WebElement shmTitle;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Not monitoring']")
    public WebElement notMonitoringText;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Everything's OK']")
    public WebElement everythingOkayText;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Close']")
    public WebElement closeButton;

    @AndroidFindBy(accessibility = "New Scene")
    public WebElement sceneButton;

    @AndroidFindBy(id = "android:id/alertTitle")
    public WebElement alertPopUp;


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

    public void verifyMoreOptionsButtonIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify More Options Button is displayed");
        Logger.logStep("Verify More Options Button is displayed");
        moreOptions.isDisplayed();
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

    public void verifySceneNameButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Scene Name Button is displayed");
        Logger.logStep("Verify Scene Name Button is displayed");
        assertTrue(sceneButton.isDisplayed());
    }

    public void clickSceneNameButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Scene Name Button");
        Logger.logStep("Click on Scene Name Button");
        sceneButton.click();
        Thread.sleep(4000L);
    }

    public void verifySHMTitleIsDisplayed() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM title is displayed");
        Logger.logStep("Verify SHM title is displayed");
        assertTrue(shmTitle.isDisplayed());
    }

    public void clickSHMTitle() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click SHM title");
        Logger.logStep("Click SHM title");
        shmTitle.click();
    }

    public void verifyNonMonitoringTextIsDisplayed() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Non Monitoring Text is displayed");
        Logger.logStep("Verify Non Monitoring Text is displayed");
        assertTrue(notMonitoringText.isDisplayed());
    }

    public void verifyEverythingOkTextIsDisplayed() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Everything Ok is displayed");
        Logger.logStep("Verify Everything Ok is displayed");
        assertTrue(everythingOkayText.isDisplayed());
    }

    public void verifyAndClickArmedStayButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Armed Stay Button is displayed");
        Logger.logStep("Verify Armed Stay Button is displayed");
        armedStayButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Armed Stay Button");
        Logger.logStep("Click on Armed Stay Button");
        armedStayButton.click();
    }

    public void verifyAndClickArmedAwayButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Armed Away Button is displayed");
        Logger.logStep("Verify Armed Away Button is displayed");
        armedAwayButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Armed Away Button");
        Logger.logStep("Click on Armed Away Button");
        armedAwayButton.click();
    }

    public void verifyAndClickDisarmedButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Disarmed Button is displayed");
        Logger.logStep("Verify Disarmed Button is displayed");
        disArmedButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Disarmed Button");
        Logger.logStep("Click on Disarmed Button");
        disArmedButton.click();
    }

    public void proceedSHMViewIfNecessary() throws InterruptedException {
        if(isSHMViewDisplayed()) {
            closeButton.click();
        } else {
            verifySHMTitleIsDisplayed();
        }
    }

    public boolean isSHMViewDisplayed() {
        try {
            alertPopUp.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

