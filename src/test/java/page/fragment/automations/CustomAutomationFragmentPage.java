package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class CustomAutomationFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public CustomAutomationFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Add condition\"])[1]")
    public WebElement addConditionButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Add condition\"])[2]")
    public WebElement addActionButton;

    public void verifyAndClickAddConditionButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Condition Button is displayed");
        Logger.logStep("Verify Add Condition Button is displayed");
        addConditionButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Condition Button");
        Logger.logStep("Click on Add Condition Button");
        addConditionButton.click();
    }

    public void verifyAndClickAddActionButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Action Button is displayed");
        Logger.logStep("Verify Add Action Button is displayed");
        addConditionButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Action Button");
        Logger.logStep("Click on Add Action Button");
        addConditionButton.click();
    }
}
