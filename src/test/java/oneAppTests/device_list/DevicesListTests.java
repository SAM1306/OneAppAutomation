package oneAppTests.device_list;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.junit.Before;
import org.junit.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.SupportedDevicesFragmentPage;
import page.view.ToolbarPage;
import utility.Logger;

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

    @Before
    public void setUp() {

        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        supportedDevicesFragmentPage = new SupportedDevicesFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
    }

    @Test
    public void listSupportedDevices() throws InterruptedException {
        Logger.logAction("Begin: listSupportedDevices() - Test_001");
        Logger.logStep("Click on Dashboard Button");
        primaryActivity.dashboardButton.click();

        Logger.logStep("Verify Supported Devices Button is displayed");
        dashboardFragmentPage.supportedDevicesTiles.isDisplayed();
        Logger.logStep("Click on Supported Devices Button Button");
        dashboardFragmentPage.supportedDevicesTiles.click();

        Thread.sleep(6000L);
        Logger.logStep("Verify Search Bar is displayed");
        supportedDevicesFragmentPage.searchBar.isDisplayed();

        toolbarPage.backArrow.isDisplayed();
        Logger.logStep("Click on Navigate Up Button");
        toolbarPage.backArrow.click();

        Logger.logStep("Verify Smartthings Logo is displayed");
        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }
}
