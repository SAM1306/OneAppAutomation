package oneAppTests.scenes;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.devices.DevicesFragmentPage;
import page.fragment.devices.scenes.AddActionsFragmentPage;
import page.fragment.devices.scenes.AddSceneFragmentPage;
import page.fragment.devices.scenes.SceneInformationFragmentPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class SceneTests extends BaseAppiumTest{

    private static final String TEST_NAME = SceneTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();
    private String sceneName = "Test Scene";

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private DevicesFragmentPage devicesFragmentPage;
    private AddSceneFragmentPage addSceneFragmentPage;
    private AddActionsFragmentPage addActionsFragmentPage;
    private SceneInformationFragmentPage sceneInformationFragmentPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addSceneFragmentPage = new AddSceneFragmentPage(driver);
        addActionsFragmentPage = new AddActionsFragmentPage(driver);
        sceneInformationFragmentPage = new SceneInformationFragmentPage(driver);
    }

    @Test(priority=1)
    public void sceneCreateTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Scenes: Add Scene");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add Scene Test - Start");

        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickMoreOptionsButton();
        devicesFragmentPage.getDevicesFragmentPage();
        devicesFragmentPage.verifyAndClickAddSceneButton();
        addSceneFragmentPage.verifyAndClickSceneNameTextBox();
        addSceneFragmentPage.addSceneName(sceneName);
        addSceneFragmentPage.verifyAndClickAddActionsButton();

        addActionsFragmentPage.verifyAndClickOutletButton();
        addActionsFragmentPage.verifyAndClickOnRadioButton();
        addActionsFragmentPage.verifyAndClickDoneButton();
        addActionsFragmentPage.verifyAndClickSaveButton();
        devicesFragmentPage.verifyCreatedSceneIsDisplayed();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add Scene Test - End");
    }

    @Test(priority=3)
    public void sceneDeleteTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Scenes: Delete Scene");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Scene Test - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifySceneInfoButton();
        dashboardFragmentPage.clickSceneInfoButton();
        sceneInformationFragmentPage.verifyAndClickEditButton();
        addSceneFragmentPage.verifyAndClickDeleteButton();
        addSceneFragmentPage.verifyAndClickConfirmDeleteButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Scene Test - End");
    }

    @Test(priority=2)
    public void sceneEditTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Scenes: Edit Scene");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Edit Scene Test - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifySceneInfoButton();
        dashboardFragmentPage.clickSceneInfoButton();
        sceneInformationFragmentPage.verifyAndClickEditButton();
        addSceneFragmentPage.verifyAndClickRemoveButton();
        addSceneFragmentPage.verifyAndClickAddActionsButton();

        addActionsFragmentPage.verifyAndClickOutletButton();
        addActionsFragmentPage.verifyAndClickOnRadioButton();
        addActionsFragmentPage.verifyAndClickDoneButton();
        addActionsFragmentPage.verifyAndClickSaveButton();
        dashboardFragmentPage.verifySceneInfoButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Edit Scene Test - End");
    }
}
