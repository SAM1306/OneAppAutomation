package oneAppTests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import page.activity.PrimaryActivity;
import page.fragment.*;
import page.view.ToolbarPage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Caps extends BaseAppiumTest{

    private static final String TEST_NAME = Caps.class.getName();

    private static AndroidDriver driver;
    private String sceneName = "Test Scene";

    private DashboardFragmentPage dashboardFragmentPage;
    private SupportedDevicesFragmentPage supportedDevicesFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private SHMFragmentPage shmFragmentPage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;
    private SmartthingsSettingsFragmentPage smartthingsSettingsFragmentPage;
    private HelpFragmentPage helpFragmentPage;
    private DevicesFragmentPage devicesFragmentPage;
    private AddSceneFragmentPage addSceneFragmentPage;
    private AddActionsFragmentPage addActionsFragmentPage;
    private SceneInformationFragmentPage sceneInformationFragmentPage;

    /*
    @Override
    public void setup() {
        super.setup();

        dashboardFragmentPage = new DashboardFragmentPage(driver);
        primaryActivity = new PrimaryActivity(driver);
        supportedDevicesFragmentPage = new SupportedDevicesFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        shmFragmentPage = new SHMFragmentPage(driver);
        helpFragmentPage = new HelpFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        smartthingsSettingsFragmentPage = new SmartthingsSettingsFragmentPage(driver);
    }
    */

    @Override
    public String getTestName() {
        return TEST_NAME;
    }


    @Before
    public void testCaseSetup()throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "0738a0e100999b44");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0");
        caps.setCapability("appPackage", "com.samsung.android.oneconnect");
        caps.setCapability("appActivity", "com.samsung.android.oneconnect.ui.SCMainActivity");
        caps.setCapability("app", "/Users/sjain/Downloads/User_apt_SmartThings_1.7.4_23_RC3_minApi_23_production_release.apk");
        caps.setCapability("noReset", "true");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability("autoAcceptAlerts", true);

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void someTest() {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.dashboardButton.click();

        dashboardFragmentPage = new DashboardFragmentPage(driver);
        assertTrue(dashboardFragmentPage.smartthingsLogo.isDisplayed());
        assertTrue(dashboardFragmentPage.moreOptions.isDisplayed());
    }

    @Test
    public void listSupportedDevices() throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.dashboardButton.click();

        dashboardFragmentPage = new DashboardFragmentPage(driver);
        dashboardFragmentPage.supportedDevicesTiles.isDisplayed();
        dashboardFragmentPage.supportedDevicesTiles.click();

        Thread.sleep(6000L);
        supportedDevicesFragmentPage = new SupportedDevicesFragmentPage(driver);
        supportedDevicesFragmentPage.searchBar.isDisplayed();

        toolbarPage = new ToolbarPage(driver);
        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }

    @Test
    public void automationASetUp() throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.automationsButton.isDisplayed();
        primaryActivity.automationsButton.click();
        Thread.sleep(6000L);

        automationsFragmentPage = new AutomationsFragmentPage(driver);
        automationsFragmentPage.addAutomationButton.isDisplayed();
        automationsFragmentPage.addAutomationButton.click();

        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        addAutomationFragmentPage.smartHomeMonitor.isDisplayed();
        addAutomationFragmentPage.smartHomeMonitor.click();

        shmFragmentPage = new SHMFragmentPage(driver);
        shmFragmentPage.getSHMFragmentPage();
        shmFragmentPage.nextButton.isDisplayed();
        shmFragmentPage.nextButton.click();
        shmFragmentPage.nextButton.click();
        shmFragmentPage.sirenDurationTextBox.click();
        shmFragmentPage.sirenDurationTextBox.sendKeys("1");
        shmFragmentPage.doneButton.isDisplayed();
        shmFragmentPage.doneButton.click();

        scrollAndClick("ALLOW");
        addAutomationFragmentPage.getSHMFragmentPage();
        assertTrue(addAutomationFragmentPage.smartHomeMonitor.isDisplayed());
    }

    @Test
    public void automationDelete() throws  InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.automationsButton.isDisplayed();
        primaryActivity.automationsButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage = new DashboardFragmentPage(driver);
        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();

        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        moreOptionsFragmentPage.deleteButton.click();

        automationsFragmentPage = new AutomationsFragmentPage(driver);
        automationsFragmentPage.smartHomeMonitorButton.isDisplayed();
        automationsFragmentPage.smartHomeMonitorButton.click();

        toolbarPage = new ToolbarPage(driver);
        toolbarPage.deleteButton.click();
        Thread.sleep(3000L);
        primaryActivity.popUpDeleteButton.click();
    }

    @Test
    public void helpTesting() throws InterruptedException {
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();
        Thread.sleep(4000L);

        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        moreOptionsFragmentPage.helpButton.isDisplayed();
        moreOptionsFragmentPage.helpButton.click();

        helpFragmentPage = new HelpFragmentPage(driver);
        assertTrue(helpFragmentPage.myQuestions.isDisplayed());
        assertTrue(helpFragmentPage.faq.isDisplayed());
        assertTrue(helpFragmentPage.emailCustomerService.isDisplayed());
        assertTrue(helpFragmentPage.callCustomerService.isDisplayed());
        assertTrue(helpFragmentPage.reportProblem.isDisplayed());

        toolbarPage = new ToolbarPage(driver);
        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }

    @Test
    public void settingsTesting() throws InterruptedException {
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();
        Thread.sleep(4000L);

        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        moreOptionsFragmentPage.settingsButton.isDisplayed();
        moreOptionsFragmentPage.settingsButton.click();

        smartthingsSettingsFragmentPage = new SmartthingsSettingsFragmentPage(driver);
        smartthingsSettingsFragmentPage.getSmartthingsSettingsFragmentPage();
        assertTrue(smartthingsSettingsFragmentPage.samsungAccount.isDisplayed());

        toolbarPage = new ToolbarPage(driver);
        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }

    @Test
    public void sceneCreateTest() throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.devicesButton.click();
        Thread.sleep(4000L);

        devicesFragmentPage = new DevicesFragmentPage(driver);
        devicesFragmentPage.moreOptionsButton.click();
        devicesFragmentPage.getDevicesFragmentPage();
        devicesFragmentPage.addSceneButton.click();

        addSceneFragmentPage = new AddSceneFragmentPage(driver);
        addSceneFragmentPage.sceneNameTextBox.sendKeys(sceneName);
        addSceneFragmentPage.addActionsButton.click();

        addActionsFragmentPage = new AddActionsFragmentPage(driver);
        addActionsFragmentPage.outletButton.click();
        addActionsFragmentPage.onRadioButton.click();
        addActionsFragmentPage.doneButton.click();
        addActionsFragmentPage.saveButton.click();
        assertTrue(devicesFragmentPage.createdScene.isDisplayed());
    }
    @Test
    public void sceneDeleteTest() throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.dashboardButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage = new DashboardFragmentPage(driver);
        dashboardFragmentPage.sceneInfoButton.click();
        dashboardFragmentPage.sceneInfoButton.click();
        Thread.sleep(4000L);

        sceneInformationFragmentPage = new SceneInformationFragmentPage(driver);
        sceneInformationFragmentPage.editButton.click();

        addSceneFragmentPage = new AddSceneFragmentPage(driver);
        addSceneFragmentPage.deleteButton.click();
        addSceneFragmentPage.confirmDeleteButton.click();
    }
    @Test
    public void sceneEditTest() throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        primaryActivity.dashboardButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage = new DashboardFragmentPage(driver);
        dashboardFragmentPage.sceneInfoButton.click();
        dashboardFragmentPage.sceneInfoButton.click();
        Thread.sleep(4000L);

        sceneInformationFragmentPage = new SceneInformationFragmentPage(driver);
        sceneInformationFragmentPage.editButton.click();

        addSceneFragmentPage = new AddSceneFragmentPage(driver);
        addSceneFragmentPage.removeButton.click();
        addSceneFragmentPage.addActionsButton.click();

        addActionsFragmentPage = new AddActionsFragmentPage(driver);
        addActionsFragmentPage.outletButton.click();
        addActionsFragmentPage.onRadioButton.click();
        addActionsFragmentPage.doneButton.click();
        addActionsFragmentPage.saveButton.click();
        assertTrue(dashboardFragmentPage.sceneInfoButton.isDisplayed());
    }

    public static void scrollAndClick(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }
}
