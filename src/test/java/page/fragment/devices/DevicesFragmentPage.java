package page.fragment.devices;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
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

    public DevicesFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/add_device")
    public WebElement addDeviceButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/spinner_image_icon")
    public WebElement deviceListFilterImage;

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

    @AndroidFindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Add location']")
    public WebElement addLocationButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='All devices']")
    public WebElement allDevicesButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Office']")
    public WebElement officeLocationButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Edit']")
    public WebElement editButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Office']")
    public WebElement locationName;

    public DevicesFragmentPage getDevicesFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(addSceneButton));
        return new DevicesFragmentPage((AndroidDriver) driver);
    }

    public void verifyAddDeviceButtonIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Device Button is displayed");
        Logger.logStep("Verify Add Device Button is displayed");
        assertTrue(addDeviceButton.isDisplayed());
    }

    public void verifyDeviceListFilterImageIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Device List Filter Image is displayed");
        Logger.logStep("Verify Device List Filter Image is displayed");
        assertTrue(deviceListFilterImage.isDisplayed());
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

    public void clickCreatedSceneButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click Created Scene Button");
        Logger.logStep("Click Created Scene Button");
        createdScene.click();
    }

    public void verifyAndClickHomeLocationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Home Location Button is displayed");
        Logger.logStep("Verify Home Location Button is displayed");
        homeLocationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Home Location Button");
        Logger.logStep("Click on Home Location Button");
        homeLocationButton.click();
    }

    public void verifyAndClickAddLocationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Location Button is displayed");
        Logger.logStep("Verify Add Location Button is displayed");
        addLocationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Location Button");
        Logger.logStep("Click on Add Location Button");
        addLocationButton.click();
    }

    public void verifyAddLocationButtonIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Location Button is displayed");
        Logger.logStep("Verify Add Location Button is displayed");
        addLocationButton.isDisplayed();
    }

    public void verifyAllDevicesButtonIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify All Device Button is displayed");
        Logger.logStep("Verify All Device Button is displayed");
        assertTrue(allDevicesButton.isDisplayed());
    }

    public void verifyAndClickOfficeLocationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Office Location Button is displayed");
        Logger.logStep("Verify Office Location Button is displayed");
        officeLocationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Office Location Button");
        Logger.logStep("Click on Office Location Button");
        officeLocationButton.click();
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

    public void verifyCreatedLocationIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Created Location is displayed");
        Logger.logStep("Verify Created Location is displayed");
        assertTrue(locationName.isDisplayed());
    }
}
