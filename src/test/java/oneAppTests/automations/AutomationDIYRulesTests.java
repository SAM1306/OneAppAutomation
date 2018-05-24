package oneAppTests.automations;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.automations.*;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.fragment.devices.scenes.AddActionsFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AutomationDIYRulesTests extends BaseAppiumTest {

    private static final String TEST_NAME = AutomationDIYRulesTests.class.getName();
    private String notificationMessage = "Test Custom Automation";

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private AutomationsFragmentPage automationsFragmentPage;
    private AddAutomationFragmentPage addAutomationFragmentPage;
    private AddConditionFragmentPage addConditionFragmentPage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;
    private AddActionsFragmentPage addActionsFragmentPage;
    private CustomAutomationFragmentPage customAutomationFragmentPage;
    private AddAutomationActionsFragmentPage addAutomationActionsFragmentPage;

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
        addConditionFragmentPage = new AddConditionFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        customAutomationFragmentPage = new CustomAutomationFragmentPage(driver);
        addAutomationActionsFragmentPage = new AddAutomationActionsFragmentPage(driver);
        addActionsFragmentPage = new AddActionsFragmentPage(driver);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        deleteCustomAutomation();
    }

    @Test(priority=1)
    public void addAutomationDIYRulesSpecificTime() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Custom Automation with DIY Rules at Specific Time");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules at Specific Time - Start");

        navigateToCustomAutomation();
        setSpecificTimeAutomation();
        addConditionFragmentPage.verifyAndClickCancelButton();
        navigateToCustomAutomation();
        setSpecificTimeAutomation();
        addActionCustomAutomation();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules at Specific Time - End");
    }

    @Test(priority=2)
    public void addAutomationDIYRulesSunrise() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Custom Automation with DIY Rules during Sunrise");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules during Sunrise - Start");

        navigateToCustomAutomation();
        setSunriseTimeAutomation();
        addConditionFragmentPage.verifyAndClickCancelButton();
        navigateToCustomAutomation();
        setSunriseTimeAutomation();
        addActionCustomAutomation();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rulesrise during Sunrise - End");
    }

    @Test(priority=3)
    public void addAutomationDIYRulesSunset() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Custom Automation with DIY Rules during Sunset");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules during Sunset- Start");

        navigateToCustomAutomation();
        setSunsetTimeAutomation();
        addConditionFragmentPage.verifyAndClickCancelButton();
        navigateToCustomAutomation();
        setSunsetTimeAutomation();
        addActionCustomAutomation();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules during Sunset - End");
    }

    public void navigateToCustomAutomation() throws InterruptedException {
        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.verifyAndClickCustomAutomationButton();
        addConditionFragmentPage.verifyAddConditionPageTitleIsDisplayed();
    }

    public void setSpecificTimeAutomation() throws InterruptedException {
        addConditionFragmentPage.verifyAndClickTimeOfDayTile();
        addConditionFragmentPage.verifyAndClickSpecificTimeRadioButton();
        addConditionFragmentPage.verifyAndClickWeekendButton();
        toolbarPage.verifyAndClickSmartAppNextButton();
    }

    public void deleteCustomAutomation() throws InterruptedException {
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickDeleteButton();
        automationsFragmentPage.verifyAndClickCustomAutomationButton();
        toolbarPage.verifyAndClickDeleteButton();
        primaryActivity.verifyAndClickPopUpDeleteButton();
    }

    public void addActionCustomAutomation() throws InterruptedException {
        customAutomationFragmentPage.verifyAndClickAddActionButton();
        addAutomationActionsFragmentPage.verifyAddActionPageTitleIsDisplayed();
        addAutomationActionsFragmentPage.verifyAndClickNotifyMeTile();
        addAutomationActionsFragmentPage.verifyAndClickNotificationBox();
        addAutomationActionsFragmentPage.addNotificationMessage(notificationMessage);
        addAutomationActionsFragmentPage.verifyAndClickDoneButton();
        customAutomationFragmentPage.verifyAndClickAddActionButton();
        addAutomationActionsFragmentPage.verifyAndClickControlDeviceTile();
        addAutomationActionsFragmentPage.verifyAndClickOutletTile();
        addActionsFragmentPage.verifyAndClickOnRadioButton();
        toolbarPage.verifyAndClickSmartAppNextButton();
        toolbarPage.verifyAndClickSaveButton();
        primaryActivity.verifyAndClickOKButton();
    }

    public void setSunriseTimeAutomation() throws InterruptedException {
        addConditionFragmentPage.verifyAndClickTimeOfDayTile();
        addConditionFragmentPage.verifyAndClickSunriseRadioButton();
        addConditionFragmentPage.verifyAndClickWeekendButton();
        toolbarPage.verifyAndClickSmartAppNextButton();
    }

    public void setSunsetTimeAutomation() throws InterruptedException {
        addConditionFragmentPage.verifyAndClickTimeOfDayTile();
        addConditionFragmentPage.verifyAndClickSunsetRadioButton();
        addConditionFragmentPage.verifyAndClickWeekendButton();
        toolbarPage.verifyAndClickSmartAppNextButton();
    }
}
