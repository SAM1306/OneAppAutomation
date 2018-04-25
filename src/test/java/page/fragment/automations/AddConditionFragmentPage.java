package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AddConditionFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public AddConditionFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add condition']")
    public WebElement addConditionPageTitle;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Based on the time of day']")
    public WebElement timeOFDayTile;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_button_sunrise")
    public WebElement sunriseButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_button_sunset")
    public WebElement sunsetButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_cancel")
    public WebElement cancelButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_done")
    public WebElement doneButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_spinner")
    public WebElement timeOFDayMenu;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_saturday")
    public WebElement saturdayButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_sunday")
    public WebElement sundayButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Specific time']")
    public WebElement specificTimeButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.NumberPicker[2]/android.widget.Button[4]")
    public WebElement setSpecificTimeButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.NumberPicker/android.widget.Button[4]")
    public WebElement setTimeButton;

    public void verifyAddConditionPageTitleIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Condition Page Title is displayed");
        Logger.logStep("Verify Add Condition Page Title is displayed");
        addConditionPageTitle.isDisplayed();
    }

    public void clickSetTime() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Add time for Automation to run");
        Logger.logStep("Add time for Automation to run");
        setTimeButton.click();
    }

    public void clickSetSpecificTime() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Add time for Automation to run");
        Logger.logStep("Add time for Automation to run");
        setSpecificTimeButton.click();
    }

    public void verifyAndClickTimeOfDayTile() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Time of Day tile is displayed");
        Logger.logStep("Verify Time of Day tile is displayed");
        timeOFDayTile.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Time of Day tile");
        Logger.logStep("Click on Time of Day tile");
        timeOFDayTile.click();
    }

    public void verifyAndClickSunriseButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Sunrise Button is displayed");
        Logger.logStep("Verify Sunrise Button is displayed");
        sunriseButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Sunrise Button");
        Logger.logStep("Click on Sunrise Button");
        sunriseButton.click();
    }

    public void verifyAndClickSunsetButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Sunset Button is displayed");
        Logger.logStep("Verify Sunset Button is displayed");
        sunsetButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Sunset Button");
        Logger.logStep("Click on Sunset Button");
        sunsetButton.click();
    }

    public void verifyAndClickCancelButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Cancel Button is displayed");
        Logger.logStep("Verify Cancel Button is displayed");
        cancelButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Cancel Button");
        Logger.logStep("Click on Cancel Button");
        cancelButton.click();
    }

    public void verifyAndClickDoneButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "VerifyDone Button is displayed");
        Logger.logStep("Verify Done Button is displayed");
        doneButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Done Button");
        Logger.logStep("Click on Done Button");
        doneButton.click();
    }

    public void verifyAndClickTimeOfDayMenu() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Time of Day Menu is displayed");
        Logger.logStep("Verify Time of Day Menu is displayed");
        timeOFDayMenu.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Time of Day Menu");
        Logger.logStep("Click on Time of Day Menu");
        timeOFDayMenu.click();
    }

    public void verifyAndClickWeekendButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Days are displayed");
        Logger.logStep("Verify Days is displayed");
        saturdayButton.isDisplayed();
        sundayButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Saturday and Sunday");
        Logger.logStep("Click on Saturday and Sunday");
        saturdayButton.click();
        sundayButton.click();
    }

    public void verifyAndClickSpecificTimeButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Specific Time Button is displayed");
        Logger.logStep("Verify Specific Time Button is displayed");
        specificTimeButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Specific Time Button");
        Logger.logStep("Click on Specific Time Button");
        specificTimeButton.click();
    }
}
