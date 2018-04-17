package oneAppTests.device_list;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.devices.DevicesFragmentPage;
import page.fragment.devices.locations.AddLocationFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class LocationTests extends BaseAppiumTest {

    private static final String TEST_NAME = LocationTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();
    private String locationName = "Office";

    private DashboardFragmentPage dashboardFragmentPage;
    private DevicesFragmentPage devicesFragmentPage;
    private PrimaryActivity primaryActivity;
    private AddLocationFragmentPage addLocationFragmentPage;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addLocationFragmentPage = new AddLocationFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
    }

    @Test(priority = 1)
    public void createLocationTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Create Location Test");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Create Location Test - Start");

        primaryActivity.getDashboardButton();
        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickDeviceDropdownButton();
        devicesFragmentPage.verifyAndClickAddLocationButton();
        addLocationFragmentPage.verifyAndClickLocationNameTextBox();
        addLocationFragmentPage.addLocationName(locationName);
        toolbarPage.verifyAndClickSaveButton();
        devicesFragmentPage.verifyCreatedLocationIsDisplayed();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Create Location Test - End");
    }

    @Test(priority = 2)
    public void deleteLocationTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Delete Location Test");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Location Test - Start");

        primaryActivity.getDashboardButton();
        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickDeviceDropdownButton();
        devicesFragmentPage.verifyAndClickOfficeLocationButton();
        devicesFragmentPage.verifyAndClickMoreOptionsButton();
        devicesFragmentPage.verifyAndClickEditButton();
        addLocationFragmentPage.verifyAndClickDeleteButton();
        addLocationFragmentPage.verifyAndClickRemoveButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Location Test - End");
    }
}
