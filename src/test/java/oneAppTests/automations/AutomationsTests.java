package oneAppTests.automations;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import page.fragment.automations.SHMFragmentPage;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.view.ToolbarPage;
import utility.Logger;

import static utility.Events.scrollAndClick;

@Test
public class AutomationsTests extends BaseAppiumTest{

    private static final String TEST_NAME = AutomationsTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private SHMFragmentPage shmFragmentPage;
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
        shmFragmentPage = new SHMFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
    }

    @Test(priority=1)
    public void addSHMAutomation() throws InterruptedException {
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - Start");

        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.verifySHMButtonIsPresent();
        addAutomationFragmentPage.clickSHMButton();
        shmFragmentPage.getSHMFragmentPage();
        shmFragmentPage.verifyAndClickNextButton();
        shmFragmentPage.verifyAndClickNextButton();
        shmFragmentPage.verifyAndClickSirenDurationTextBox();
        shmFragmentPage.addSirenDuration("1");
        shmFragmentPage.verifyAndClickDoneButton();
        scrollAndClick("ALLOW");
        addAutomationFragmentPage.getSHMFragmentPage();
        addAutomationFragmentPage.verifySHMButtonIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - End");
    }

    @Test(priority=2)
    public void deleteSHMAutomation() throws  InterruptedException {
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
