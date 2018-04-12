package page.fragment.devices;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static junit.framework.TestCase.assertTrue;

public class DevicesFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "DevicesFragmentScreen";

    public DevicesFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "More options")
    public WebElement moreOptionsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add scene']")
    public WebElement addSceneButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add room']")
    public WebElement addRoomButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mode_name_new")
    public WebElement createdScene;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner/android.widget.LinearLayout/android.widget.ImageView[2]")
    public WebElement deviceDropdown;

    @AndroidFindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Home']")
    public WebElement homeLocationButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Edit']")
    public WebElement editButton;


    public DevicesFragmentPage getDevicesFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(addSceneButton));
        return new DevicesFragmentPage((AndroidDriver) driver);
    }

    public void verifyAndClickMoreOptionsButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify More Options Button is displayed");
        Logger.logStep("Verify More Options Button is displayed");
        moreOptionsButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on More Options Button");
        Logger.logStep("Click on More Options Button");
        moreOptionsButton.click();
    }

    public void verifyAndClickAddSceneButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Scene Button is displayed");
        Logger.logStep("Verify Add Scene Button is displayed");
        addSceneButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Scene Button");
        Logger.logStep("Click on Add Scene Button");
        addSceneButton.click();
    }

    public void verifyAndClickAddRoomButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Room Button is displayed");
        Logger.logStep("Verify Add Room Button is displayed");
        addRoomButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Room Button");
        Logger.logStep("Click on Add Room Button");
        addRoomButton.click();
    }

    public void verifyCreatedSceneIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Created Scene Button is displayed");
        Logger.logStep("Verify Created Scene Button is displayed");
        assertTrue(createdScene.isDisplayed());
    }

    public void verifyAndClickHomeLocationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Home Location Button is displayed");
        Logger.logStep("Verify Home Location Button is displayed");
        homeLocationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Home Location Button");
        Logger.logStep("Click on Home Location Button");
        homeLocationButton.click();
    }

    public void verifyAndClickEditButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Edit Button is displayed");
        Logger.logStep("Verify Edit Button is displayed");
        editButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Edit Button");
        Logger.logStep("Click on Edit Button");
        editButton.click();
    }

    public void verifyAndClickDeviceDropdownButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Device Dropdown Button is displayed");
        Logger.logStep("Verify Device Dropdown Button is displayed");
        deviceDropdown.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Device Dropdown Button");
        Logger.logStep("Click on Device Dropdown Button");
        deviceDropdown.click();
    }
}
