package oneAppTests.automations;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.BeforeTest;
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
public class AutomationsTests extends BaseAppiumTest{

    private static final String TEST_NAME = AutomationsTests.class.getName();

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private SHMConfigurePage shmConfigurePage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        shmConfigurePage = new SHMConfigurePage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
    }

    @Test(priority=1)
    public void addSHMAutomation() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automations: Add SHM Automation");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - Start");

        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.verifySHMButtonIsPresent();
        addAutomationFragmentPage.clickSHMButton();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickNextButton();
        shmConfigurePage.verifyAndClickSirenDurationTextBox();
        shmConfigurePage.addSirenDuration("1");
        shmConfigurePage.verifyAndClickDoneButton();
        shmConfigurePage.scrollAndClickAllowButton();
        addAutomationFragmentPage.verifySHMIsCreated();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - End");
    }

    @Test(priority=2)
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
