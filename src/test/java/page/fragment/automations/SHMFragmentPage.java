package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class SHMFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SHMScreen";

    public SHMFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/shm_main_actionbar_title")
    public WebElement shmPageTitle;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/shm_banner_away_icon")
    public WebElement armedAwaySHMButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/shm_banner_stay_icon")
    public WebElement armedStaySHMButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/shm_banner_disarmed_icon")
    public WebElement disarmedSHMButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Settings']")
    public WebElement settingsSHMButton;

    public void verifySHMPageTitleIsDisplayed() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM page title is displayed");
        Logger.logStep("Verify SHM page title is displayed");
        assertTrue(shmPageTitle.isDisplayed());
    }
    public void verifyAndClickSettingsButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Settings Button is displayed");
        Logger.logStep("Verify Settings Button is displayed");
        settingsSHMButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Settings Button");
        Logger.logStep("Click on Settings Button");
        settingsSHMButton.click();
    }

    public void verifyAndClickSHMArmedStayButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM Armed Stay Button is displayed");
        Logger.logStep("Verify SHM Armed Stay Button is displayed");
        armedStaySHMButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on SHM Armed Stay Button");
        Logger.logStep("Click on SHM Armed Stay Button");
        armedStaySHMButton.click();
    }

    public void verifyAndClickSHMArmedAwayButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM Armed Away Button is displayed");
        Logger.logStep("Verify SHM Armed Away Button is displayed");
        armedAwaySHMButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on SHM Armed Away Button");
        Logger.logStep("Click on SHM Armed Away Button");
        armedAwaySHMButton.click();
    }

    public void verifyAndClickSHMDisarmedButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM Disarmed Button is displayed");
        Logger.logStep("Verify SHM Disarmed Button is displayed");
        disarmedSHMButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on SHM Disarmed Button");
        Logger.logStep("Click on SHM Disarmed Button");
        disarmedSHMButton.click();
    }
}
