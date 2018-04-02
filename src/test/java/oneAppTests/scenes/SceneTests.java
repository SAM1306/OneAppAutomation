package oneAppTests.scenes;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.junit.Before;
import org.junit.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.devices.DevicesFragmentPage;
import page.fragment.devices.scenes.AddActionsFragmentPage;
import page.fragment.devices.scenes.AddSceneFragmentPage;
import page.fragment.devices.scenes.SceneInformationFragmentPage;

import static org.junit.Assert.assertTrue;

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

    @Before
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addSceneFragmentPage = new AddSceneFragmentPage(driver);
        addActionsFragmentPage = new AddActionsFragmentPage(driver);
        sceneInformationFragmentPage = new SceneInformationFragmentPage(driver);
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
