package oneAppTests.automations;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class AutomationCatalog extends BaseAppiumTest {

    private static final String TEST_NAME = AutomationsTests.class.getName();

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private PrimaryActivity primaryActivity;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
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

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add SHM Automation - End");
    }
}
