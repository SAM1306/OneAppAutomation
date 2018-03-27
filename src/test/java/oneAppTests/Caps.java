package oneAppTests;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import page.activity.PrimaryActivity;
import page.fragment.*;
import page.view.ToolbarPage;

import static org.junit.Assert.assertTrue;
import static utility.Events.scrollAndClick;

public class Caps extends BaseAppiumTest{

    private static final String TEST_NAME = Caps.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();
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

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @Before
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        supportedDevicesFragmentPage = new SupportedDevicesFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        shmFragmentPage = new SHMFragmentPage(driver);
        helpFragmentPage = new HelpFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        smartthingsSettingsFragmentPage = new SmartthingsSettingsFragmentPage(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addSceneFragmentPage = new AddSceneFragmentPage(driver);
        addActionsFragmentPage = new AddActionsFragmentPage(driver);
        sceneInformationFragmentPage = new SceneInformationFragmentPage(driver);
    }

    @Test
    public void someTest() {
        primaryActivity.dashboardButton.click();

        assertTrue(dashboardFragmentPage.smartthingsLogo.isDisplayed());
        assertTrue(dashboardFragmentPage.moreOptions.isDisplayed());
    }

    @Test
    public void listSupportedDevices() throws InterruptedException {
        primaryActivity.dashboardButton.click();

        dashboardFragmentPage.supportedDevicesTiles.isDisplayed();
        dashboardFragmentPage.supportedDevicesTiles.click();

        Thread.sleep(6000L);
        supportedDevicesFragmentPage.searchBar.isDisplayed();

        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }

    @Test
    public void automationASetUp() throws InterruptedException {
        primaryActivity.automationsButton.isDisplayed();
        primaryActivity.automationsButton.click();
        Thread.sleep(10000L);

        automationsFragmentPage.addAutomationButton.isDisplayed();
        automationsFragmentPage.addAutomationButton.click();

        addAutomationFragmentPage.smartHomeMonitor.isDisplayed();
        addAutomationFragmentPage.smartHomeMonitor.click();

        shmFragmentPage.getSHMFragmentPage();
        shmFragmentPage.nextButton.isDisplayed();
        shmFragmentPage.nextButton.click();
        shmFragmentPage.nextButton.click();
        shmFragmentPage.sirenDurationTextBox.click();
        shmFragmentPage.sirenDurationTextBox.sendKeys("1");
        shmFragmentPage.doneButton.isDisplayed();
        shmFragmentPage.doneButton.click();
        Thread.sleep(2000L);

        scrollAndClick("ALLOW");
        addAutomationFragmentPage.getSHMFragmentPage();
        assertTrue(addAutomationFragmentPage.smartHomeMonitor.isDisplayed());
    }

    @Test
    public void automationDelete() throws  InterruptedException {
        primaryActivity.automationsButton.isDisplayed();
        primaryActivity.automationsButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();

        moreOptionsFragmentPage.deleteButton.click();

        automationsFragmentPage.smartHomeMonitorButton.isDisplayed();
        automationsFragmentPage.smartHomeMonitorButton.click();

        toolbarPage.deleteButton.click();
        Thread.sleep(3000L);
        primaryActivity.popUpDeleteButton.click();
    }

    @Test
    public void helpTesting() throws InterruptedException {
        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();
        Thread.sleep(4000L);

        moreOptionsFragmentPage.helpButton.isDisplayed();
        moreOptionsFragmentPage.helpButton.click();

        assertTrue(helpFragmentPage.myQuestions.isDisplayed());
        assertTrue(helpFragmentPage.faq.isDisplayed());
        assertTrue(helpFragmentPage.emailCustomerService.isDisplayed());
        assertTrue(helpFragmentPage.callCustomerService.isDisplayed());
        assertTrue(helpFragmentPage.reportProblem.isDisplayed());

        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }

    @Test
    public void settingsTesting() throws InterruptedException {
        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();
        Thread.sleep(4000L);

        moreOptionsFragmentPage.settingsButton.isDisplayed();
        moreOptionsFragmentPage.settingsButton.click();

        smartthingsSettingsFragmentPage.getSmartthingsSettingsFragmentPage();
        assertTrue(smartthingsSettingsFragmentPage.samsungAccount.isDisplayed());

        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }

    @Test
    public void sceneCreateTest() throws InterruptedException {
        primaryActivity.devicesButton.click();
        Thread.sleep(4000L);

        devicesFragmentPage.moreOptionsButton.click();
        devicesFragmentPage.getDevicesFragmentPage();
        devicesFragmentPage.addSceneButton.click();

        addSceneFragmentPage.sceneNameTextBox.sendKeys(sceneName);
        addSceneFragmentPage.addActionsButton.click();

        addActionsFragmentPage.outletButton.click();
        addActionsFragmentPage.onRadioButton.click();
        addActionsFragmentPage.doneButton.click();
        addActionsFragmentPage.saveButton.click();
        assertTrue(devicesFragmentPage.createdScene.isDisplayed());
    }
    @Test
    public void sceneDeleteTest() throws InterruptedException {
        primaryActivity.dashboardButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage.sceneInfoButton.click();
        dashboardFragmentPage.sceneInfoButton.click();
        Thread.sleep(4000L);

        sceneInformationFragmentPage.editButton.click();

        addSceneFragmentPage.deleteButton.click();
        addSceneFragmentPage.confirmDeleteButton.click();
    }
    @Test
    public void sceneEditTest() throws InterruptedException {
        primaryActivity.dashboardButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage.sceneInfoButton.click();
        Thread.sleep(4000L);

        sceneInformationFragmentPage.editButton.click();

        addSceneFragmentPage.removeButton.click();
        addSceneFragmentPage.addActionsButton.click();

        addActionsFragmentPage.outletButton.click();
        addActionsFragmentPage.onRadioButton.click();
        addActionsFragmentPage.doneButton.click();
        addActionsFragmentPage.saveButton.click();
        assertTrue(dashboardFragmentPage.sceneInfoButton.isDisplayed());
    }
}
