package oneAppTests.automations.SHMTests;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import page.fragment.automations.SHMConfigurePage;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class ConfigureSmartHomeMonitorTests extends BaseAppiumTest {

    private static final String TEST_NAME = ConfigureSmartHomeMonitorTests.class.getName();

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private SHMConfigurePage shmConfigurePage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeClass
    @Parameters({"button"})
    public void setUp(String button) throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        shmConfigurePage = new SHMConfigurePage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        configureEndpointSHMSecurity(button);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        deleteSHMAutomation();
    }

    @Test(priority=1)
    public void verifySHMGotCreated() {
        addAutomationFragmentPage.verifySHMIsCreated();
    }

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

    public void configureEndpointSHMSecurity(String button) throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Configure Endpoint SHM Security");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Endpoint SHM Security - Start");

        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.clickAutomationButton(button);
        shmConfigurePage.getSHMFragmentPage();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickSirenDurationTextBox();
        shmConfigurePage.addSirenDuration("1");
        shmConfigurePage.verifyAndClickDoneButton();
        shmConfigurePage.scrollAndClickAllowButton();
        addAutomationFragmentPage.getSHMFragmentPage();
        addAutomationFragmentPage.verifySHMIsCreated();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Endpoint SHM Security - End");
    }
}