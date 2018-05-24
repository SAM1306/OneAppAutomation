package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;
import utility.events.Events;
import utility.events.EventsFactory;

public class AddConditionFragmentPage extends BasePage {

    private Events events = EventsFactory.getEvents(driver);

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

    /*
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Sunrise]")
    public WebElement sunriseButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Sunset']")
    public WebElement sunsetButton;
    */

    @AndroidFindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/" +
            "android.widget.LinearLayout[3]/android.widget.LinearLayout")
    public WebElement sunriseButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/" +
            "android.widget.LinearLayout[4]/android.widget.LinearLayout")
    public WebElement sunsetButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/cancel_menu")
    public WebElement cancelButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_saturday")
    public WebElement saturdayButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/time_picker_sunday")
    public WebElement sundayButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Specific time']")
    public WebElement specificTimeButton;

    public void verifyAddConditionPageTitleIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Condition Page Title is displayed");
        Logger.logStep("Verify Add Condition Page Title is displayed");
        addConditionPageTitle.isDisplayed();
    }

    public void verifyAndClickTimeOfDayTile() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Time of Day tile is displayed");
        Logger.logStep("Verify Time of Day tile is displayed");
        timeOFDayTile.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Time of Day tile");
        Logger.logStep("Click on Time of Day tile");
        timeOFDayTile.click();
    }

    public void verifyAndClickSunriseRadioButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Sunrise Button is displayed");
        Logger.logStep("Verify Sunrise Button is displayed");
        sunriseButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Sunrise Button");
        Logger.logStep("Click on Sunrise Button");
        sunriseButton.click();
    }

    public void verifyAndClickSunsetRadioButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Sunset Button is displayed");
        Logger.logStep("Verify Sunset Button is displayed");
        sunsetButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Sunset Button");
        Logger.logStep("Click on Sunset Button");
        sunsetButton.click();
    }

    public void verifyAndClickCancelButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Cancel Button is displayed");
        Logger.logStep("Verify Cancel Button is displayed");
        cancelButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Cancel Button");
        Logger.logStep("Click on Cancel Button");
        cancelButton.click();
        Thread.sleep(2000L);
    }

    public void verifyAndClickWeekendButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Days are displayed");
        Logger.logStep("Verify Days is displayed");
        events.scrollTo("Repeat");
        saturdayButton.isDisplayed();
        sundayButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Saturday and Sunday");
        Logger.logStep("Click on Saturday and Sunday");
        saturdayButton.click();
        sundayButton.click();
    }

    public void verifyAndClickSpecificTimeRadioButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Specific Time Button is displayed");
        Logger.logStep("Verify Specific Time Button is displayed");
        specificTimeButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Specific Time Button");
        Logger.logStep("Click on Specific Time Button");
        specificTimeButton.click();
    }
}
