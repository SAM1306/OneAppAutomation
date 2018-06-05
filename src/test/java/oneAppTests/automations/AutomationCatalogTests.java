package oneAppTests.automations;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class AutomationCatalogTests extends BaseAppiumTest {

    private static final String TEST_NAME = AutomationCatalogTests.class.getName();

    private PrimaryActivity primaryActivity;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
    }

    @Test(priority = 1)
    public void automationCatalog() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Add SHM Automation");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - Start");

        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.verifySHMButtonIsPresent();
        addAutomationFragmentPage.verifySevereWeatherAlertIsPresent();
        addAutomationFragmentPage.verifyEnhancedAutoDoorLockIsPresent();
        addAutomationFragmentPage.verifyReadyForRainIsPresent();
        addAutomationFragmentPage.verifySmartLightsIsPresent();
        addAutomationFragmentPage.verifyColorCoordinatorIsPresent();
        addAutomationFragmentPage.verifyKeepMeCozyIsPresent();
        addAutomationFragmentPage.verifyThermostatModeDirectorIsPresent();
        addAutomationFragmentPage.verifySmartWindowsIsPresent();
        addAutomationFragmentPage.verifySpeakerCompanionIsPresent();
        addAutomationFragmentPage.verifyDoorKnockerIsPresent();
//        toolbarPage.verifyAndClickBackButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - End");
    }
}
