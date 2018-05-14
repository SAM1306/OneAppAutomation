package oneAppTests.automations;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.AddAutomationFragmentPage;
import page.fragment.automations.AutomationsFragmentPage;
import page.fragment.automations.SmartLightsFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class SmartLightingTests extends BaseAppiumTest {

    private static final String TEST_NAME = SmartLightingTests.class.getName();

    private PrimaryActivity primaryActivity;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private SmartLightsFragmentPage smartLightsFragmentPage;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    @Parameters({"button", "deviceButton", "triggerButton"})
    public void setUp(String button, String deviceButton, String triggerButton) throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        automationsFragmentPage = new AutomationsFragmentPage(driver);
        addAutomationFragmentPage = new AddAutomationFragmentPage(driver);
        smartLightsFragmentPage = new SmartLightsFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        configureSmartLighting(button, deviceButton, triggerButton);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        deleteSmartLighting();
    }

    @Test(priority=1)
    public void verifySmartLightsInstalled(){
        automationsFragmentPage.verifySmartLightingIsPresent();
    }

    public void configureSmartLighting(String button, String deviceButton, String triggerButton) throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automations: Configure Smart Lights Automations");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Smart Lights Automations - Start");
        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.clickAutomationButton(button);
        smartLightsFragmentPage.verifyAndClickNewLightingAutomationButton();
        smartLightsFragmentPage.verifyAndClickWhichDevicesToControlButton();
        smartLightsFragmentPage.clickDeviceButton(deviceButton);
        toolbarPage.verifyAndClickDoneButton();
        smartLightsFragmentPage.verifyAndSelectTriggerButton(triggerButton);
        toolbarPage.verifyAndClickDoneButton();
        smartLightsFragmentPage.verifyAndClickWhichMotionButton();
        smartLightsFragmentPage.verifyAndClickMotionSensorButton();
        toolbarPage.verifyAndClickDoneButton();
        toolbarPage.verifyAndClickNextButton();
        toolbarPage.verifyAndClickDoneButton();
        toolbarPage.verifyAndClickDoneButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Endpoint SHM Security - End");
    }

    public void deleteSmartLighting() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automations: Configure Smart Lights Automations");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Smart Lights Automations - Start");
        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickMoreOptionstButton();
        automationsFragmentPage.verifyAndClickDeleteButton();
        automationsFragmentPage.verifyAndClickSmartLightingButton();
        automationsFragmentPage.verifyAndClickDeleteButton();
        automationsFragmentPage.verifyAndClicConfirmkDeleteButton();
        automationsFragmentPage.verifyAddAutomationButtonIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Configure Endpoint SHM Security - End");
    }
}
