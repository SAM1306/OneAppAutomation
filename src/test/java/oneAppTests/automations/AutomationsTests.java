package oneAppTests.automations;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.junit.Before;
import org.junit.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import page.fragment.automations.SHMFragmentPage;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.view.ToolbarPage;

import static org.junit.Assert.assertTrue;
import static utility.Events.scrollAndClick;

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

    @Before
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        shmFragmentPage = new SHMFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
    }

    @Test
    public void automationASetUp() throws InterruptedException {
        primaryActivity.automationsButton.isDisplayed();
        primaryActivity.automationsButton.click();
        Thread.sleep(10000L);

        automationsFragmentPage.addAutomationButton.isDisplayed();
        automationsFragmentPage.addAutomationButton.click();

        addAutomationFragmentPage.smartHomeMonitor.isDisplayed();
        addAutomationFragmentPage.smartHomeMonitor.click();

        shmFragmentPage.getSHMFragmentPage();
        shmFragmentPage.nextButton.isDisplayed();
        shmFragmentPage.nextButton.click();
        shmFragmentPage.nextButton.click();
        shmFragmentPage.sirenDurationTextBox.click();
        shmFragmentPage.sirenDurationTextBox.sendKeys("1");
        shmFragmentPage.doneButton.isDisplayed();
        shmFragmentPage.doneButton.click();
        Thread.sleep(2000L);

        scrollAndClick("ALLOW");
        addAutomationFragmentPage.getSHMFragmentPage();
        assertTrue(addAutomationFragmentPage.smartHomeMonitor.isDisplayed());
    }

    @Test
    public void automationDelete() throws  InterruptedException {
        primaryActivity.automationsButton.isDisplayed();
        primaryActivity.automationsButton.click();
        Thread.sleep(6000L);

        dashboardFragmentPage.moreOptions.isDisplayed();
        dashboardFragmentPage.moreOptions.click();

        moreOptionsFragmentPage.deleteButton.click();

        automationsFragmentPage.smartHomeMonitorButton.isDisplayed();
        automationsFragmentPage.smartHomeMonitorButton.click();

        toolbarPage.deleteButton.click();
        Thread.sleep(3000L);
        primaryActivity.popUpDeleteButton.click();
    }
}
