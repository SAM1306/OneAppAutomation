package oneAppTests.more_options;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.junit.Before;
import org.junit.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.HelpFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.fragment.dashboard.SmartthingsSettingsFragmentPage;
import page.view.ToolbarPage;

import static org.junit.Assert.assertTrue;

public class MoreOptionsTests extends BaseAppiumTest {

    private static final String TEST_NAME = MoreOptionsTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;
    private SmartthingsSettingsFragmentPage smartthingsSettingsFragmentPage;
    private HelpFragmentPage helpFragmentPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @Before
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        helpFragmentPage = new HelpFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        smartthingsSettingsFragmentPage = new SmartthingsSettingsFragmentPage(driver);
    }

    @Test
    public void helpTesting() throws InterruptedException {
        primaryActivity.dashboardButton.isDisplayed();
        primaryActivity.dashboardButton.click();
        Thread.sleep(6000L);

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
}
