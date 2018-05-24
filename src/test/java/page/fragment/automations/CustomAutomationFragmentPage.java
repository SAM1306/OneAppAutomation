package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class CustomAutomationFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public CustomAutomationFragmentPage(AppiumDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Add condition\"])[1]")
    public WebElement addConditionButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/" +
            "android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout")
    public WebElement addActionButton;

    public void verifyAndClickAddConditionButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Condition Button is displayed");
        Logger.logStep("Verify Add Condition Button is displayed");
        addConditionButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Condition Button");
        Logger.logStep("Click on Add Condition Button");
        addConditionButton.click();
        Thread.sleep(2000L);
    }

    public void verifyAndClickAddActionButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Action Button is displayed");
        Logger.logStep("Verify Add Action Button is displayed");
        addActionButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Action Button");
        Logger.logStep("Click on Add Action Button");
        addActionButton.click();
        Thread.sleep(2000L);
    }
}
