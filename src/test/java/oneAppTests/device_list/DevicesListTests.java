package oneAppTests.device_list;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.SupportedDevicesFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class DevicesListTests extends BaseAppiumTest {

    private static final String TEST_NAME = DevicesListTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private DashboardFragmentPage dashboardFragmentPage;
    private SupportedDevicesFragmentPage supportedDevicesFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        supportedDevicesFragmentPage = new SupportedDevicesFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
    }

    @Test(priority = 1)
    public void listSupportedDevices() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("List Supported Devices");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: List Supported Devices - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickSupportedDevciesTile();
        supportedDevicesFragmentPage.verifySearchBarIsPresent();
        toolbarPage.verifyAndClickBackButton();
        dashboardFragmentPage.verifySmartthingsLogoIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: List Supported Devices - End");
    }
}
