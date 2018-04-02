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
        primaryActivity.dashboardButton.click();

        dashboardFragmentPage.supportedDevicesTiles.isDisplayed();
        dashboardFragmentPage.supportedDevicesTiles.click();

        Thread.sleep(6000L);
        supportedDevicesFragmentPage.searchBar.isDisplayed();

        toolbarPage.backArrow.isDisplayed();
        toolbarPage.backArrow.click();

        dashboardFragmentPage.smartthingsLogo.isDisplayed();
    }
}
