package oneAppTests.device_list;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.devices.DeviceDetailFragmentPage;
import page.fragment.devices.DevicesFragmentPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class DevicesListTests extends BaseAppiumTest {

    private static final String TEST_NAME = DevicesListTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private DevicesFragmentPage devicesFragmentPage;
    private DashboardFragmentPage dashboardFragmentPage;
    private DeviceDetailFragmentPage deviceDetailFragmentPage;
    private PrimaryActivity primaryActivity;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        deviceDetailFragmentPage = new DeviceDetailFragmentPage(driver);
    }

    @Test(priority = 1)
    public void deviceListContents() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Device List Content");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Device List Content - Start");

        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAddDeviceButtonIsDisplayed();
        devicesFragmentPage.verifyDeviceListFilterImageIsDisplayed();
        dashboardFragmentPage.verifyMoreOptionsButtonIsDisplayed();
        deviceDetailFragmentPage.verifyOutletTileIsPresent();
        deviceDetailFragmentPage.verifyMotionSensorTileIsPresent();
        deviceDetailFragmentPage.verifyMultiPurposeSensorTileIsPresent();
        deviceDetailFragmentPage.verifyWaterLeakSensorTileIsPresent();
        deviceDetailFragmentPage.verifySengledBulbTileIsPresent();
        deviceDetailFragmentPage.verifyHomeHubTileIsPresent();
        devicesFragmentPage.verifyAndClickDeviceDropdownButton();
        devicesFragmentPage.verifyAllDevicesButtonIsDisplayed();
        devicesFragmentPage.verifyAddLocationButtonIsDisplayed();
        devicesFragmentPage.verifyAndClickHomeLocationButton();
        primaryActivity.getDashboardButton();
        primaryActivity.getDevicesButton();
        deviceDetailFragmentPage.verifyOutletTileIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Device List Content - End");
    }
}
