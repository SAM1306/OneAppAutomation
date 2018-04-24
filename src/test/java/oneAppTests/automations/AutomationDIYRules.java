package oneAppTests.automations;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
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

public class AutomationDIYRules extends BaseAppiumTest {

    private static final String TEST_NAME = AutomationDIYRules.class.getName();
    private String notificationMessage = "Test Custom Automation";

    private static AndroidDriver driver = TestCaseSetup.getDriver();

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

    @Test(priority=1)
    public void addAutomationDIYRulesSpecificTime() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Custom Automation with DIY Rules at Specific Time");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules at Specific Time - Start");

        navigateToCustomAutomation();
        setSpecificTimeAutomation();
        addConditionFragmentPage.verifyAndClickCancelButton();
        setSpecificTimeAutomation();
        addConditionFragmentPage.verifyAndClickDoneButton();
        addActionCustomAutomation();
        deleteCustomAutomation();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules at Specific Time - End");
    }

    @Test(priority=2)
    public void addAutomationDIYRulesSunrise() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Custom Automation with DIY Rules during Sunrise");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules during Sunrise - Start");

        navigateToCustomAutomation();
        setSunriseTimeAutomation();
        addConditionFragmentPage.verifyAndClickCancelButton();
        setSunriseTimeAutomation();
        addConditionFragmentPage.verifyAndClickDoneButton();
        addActionCustomAutomation();
        deleteCustomAutomation();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rulesrise during Sunrise - End");
    }

    @Test(priority=3)
    public void addAutomationDIYRulesSunset() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Automtions: Custom Automation with DIY Rules during Sunset");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules during Sunset- Start");

        navigateToCustomAutomation();
        setSunsetTimeAutomation();
        addConditionFragmentPage.verifyAndClickCancelButton();
        setSunsetTimeAutomation();
        addConditionFragmentPage.verifyAndClickDoneButton();
        addActionCustomAutomation();
        deleteCustomAutomation();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Custom Automation with DIY Rules during Sunset - End");
    }

    public void navigateToCustomAutomation() throws InterruptedException {
        primaryActivity.getAutomationsButton();
        automationsFragmentPage.verifyAndClickAddAutomationButton();
        addAutomationFragmentPage.verifyAndClickCustomAutomationButton();
        customAutomationFragmentPage.verifyAndClickAddConditionButton();
        addConditionFragmentPage.verifyAddConditionPageTitleIsDisplayed();
    }

    public void setSpecificTimeAutomation() {
        addConditionFragmentPage.verifyAndClickTimeOfDayTile();
        addConditionFragmentPage.verifyAndClickTimeOfDayMenu();
        addConditionFragmentPage.verifyAndClickSpecificTimeButton();
        addConditionFragmentPage.clickSetSpecificTime();
        addConditionFragmentPage.verifyAndClickWeekendButton();
    }

    public void deleteCustomAutomation() throws InterruptedException {
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickDeleteButton();
        automationsFragmentPage.verifyAndClickCustomAutomationButton();
        toolbarPage.verifyAndClickDeleteButton();
        primaryActivity.verifyAndClickPopUpDeleteButton();
    }

    public void addActionCustomAutomation() {
        toolbarPage.verifyAndClickBackButton();
        customAutomationFragmentPage.verifyAndClickAddActionButton();
        addAutomationActionsFragmentPage.verifyAddActionPageTitleIsDisplayed();
        addAutomationActionsFragmentPage.verifyAndClickInfoButton();
        primaryActivity.verifyAndClickOKButton();
        addAutomationActionsFragmentPage.verifyAndClickNotifyMeTile();
        addAutomationActionsFragmentPage.verifyAndClickNotificationBox();
        addAutomationActionsFragmentPage.addNotificationMessage(notificationMessage);
        toolbarPage.verifyAndClickDoneButton();
        addAutomationActionsFragmentPage.verifyAndClickOutletTile();
        addActionsFragmentPage.verifyAndClickOnRadioButton();
        toolbarPage.verifyAndClickDoneButton();
        toolbarPage.verifyAndClickBackButton();
        toolbarPage.verifyAndClickSaveButton();
    }

    public void setSunriseTimeAutomation() {
        addConditionFragmentPage.verifyAndClickTimeOfDayTile();
        addConditionFragmentPage.verifyAndClickTimeOfDayMenu();
        addConditionFragmentPage.verifyAndClickSpecificTimeButton();
        addConditionFragmentPage.verifyAndClickSunriseButton();
        addConditionFragmentPage.clickSetTime();
        addConditionFragmentPage.verifyAndClickWeekendButton();
    }

    public void setSunsetTimeAutomation() {
        addConditionFragmentPage.verifyAndClickTimeOfDayTile();
        addConditionFragmentPage.verifyAndClickTimeOfDayMenu();
        addConditionFragmentPage.verifyAndClickSpecificTimeButton();
        addConditionFragmentPage.verifyAndClickSunsetButton();
        addConditionFragmentPage.clickSetTime();
        addConditionFragmentPage.verifyAndClickWeekendButton();
    }
}
