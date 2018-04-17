package oneAppTests.automations;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import page.fragment.automations.SHMConfigurePage;
import page.fragment.automations.SHMFragmentPage;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static utility.Events.scrollAndClick;

@Test
public class SmartHomeMonitorTests extends BaseAppiumTest {

    private static final String TEST_NAME = AutomationsTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private SHMConfigurePage shmConfigurePage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;
    private SHMFragmentPage shmFragmentPage;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        shmConfigurePage = new SHMConfigurePage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        shmFragmentPage = new SHMFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
    }

    @Test(priority=1)
    public void configureEndpointSHMSecurity() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Configure Endpoint SHM Security");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Endpoint SHM Security - Start");

        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.verifySHMButtonIsPresent();
        addAutomationFragmentPage.clickSHMButton();
        shmConfigurePage.getSHMFragmentPage();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickSirenDurationTextBox();
        shmConfigurePage.addSirenDuration("1");
        shmConfigurePage.verifyAndClickDoneButton();
        scrollAndClick("ALLOW");
        addAutomationFragmentPage.getSHMFragmentPage();
        addAutomationFragmentPage.verifySHMButtonIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Endpoint SHM Security - End");
    }

    @Test(priority=2)
    public void armDisarmSHMSecurity() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Arm/Disarm SHM Security");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Arm/Disarm SHM Security - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifySHMTitleIsDisplayed();
        dashboardFragmentPage.verifyNonMonitoringTextIsDisplayed();
        dashboardFragmentPage.verifyAndClickArmedAwayButton();
        dashboardFragmentPage.proceedSHMViewIfNecessary();
        dashboardFragmentPage.verifyAndClickArmedStayButton();
        dashboardFragmentPage.proceedSHMViewIfNecessary();
        dashboardFragmentPage.verifyAndClickDisarmedButton();
        dashboardFragmentPage.verifyNonMonitoringTextIsDisplayed();
        dashboardFragmentPage.clickSHMTitle();
        shmFragmentPage.verifySHMPageTitleIsDisplayed();
        dashboardFragmentPage.verifyNonMonitoringTextIsDisplayed();
        shmFragmentPage.verifyAndClickSHMArmedAwayButton();
        dashboardFragmentPage.proceedSHMViewIfNecessary();
        shmFragmentPage.verifyAndClickSHMArmedStayButton();
        dashboardFragmentPage.proceedSHMViewIfNecessary();
        shmFragmentPage.verifyAndClickSHMDisarmedButton();
        dashboardFragmentPage.verifyNonMonitoringTextIsDisplayed();
        toolbarPage.verifyAndClickBackButton();
        dashboardFragmentPage.verifySHMTitleIsDisplayed();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Arm/Disarm SHM Security - End");
    }

    @Test(priority=3)
    public void editSHMSecurity() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: View/Edit SHM Security");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: View/Edit SHM Security - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifySHMTitleIsDisplayed();
        dashboardFragmentPage.clickSHMTitle();
        shmFragmentPage.verifySHMPageTitleIsDisplayed();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        shmFragmentPage.verifyAndClickSettingsButton();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickSirenDurationTextBox();
        shmConfigurePage.addSirenDuration("5");
        shmConfigurePage.verifyAndClickDoneButton();
        scrollAndClick("ALLOW");
        shmFragmentPage.verifySHMPageTitleIsDisplayed();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: View/Edit SHM Security - End");
    }

    @Test(priority=4)
    public void deleteSHMAutomation() throws  InterruptedException {
        ExtentTestManager.getTest().setDescription("Delete SHM Automation");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete SHM Automation - Start");

        primaryActivity.getAutomationsButton();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickDeleteButton();
        automationsFragmentPage.verifyAndClickSHMButton();
        toolbarPage.verifyAndClickDeleteButton();
        primaryActivity.verifyAndClickPopUpDeleteButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete SHM Automation - End");
    }
}
