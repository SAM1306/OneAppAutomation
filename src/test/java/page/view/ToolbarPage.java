package page.view;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class ToolbarPage extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public ToolbarPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "Navigate up")
    public WebElement backArrow;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_action_button")
    public WebElement deleteButton;

    public void verifyAndClickBackButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Navigate Back Button is displayed");
        Logger.logStep("Verify Back Button is displayed");
        backArrow.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Back Button");
        Logger.logStep("Click on Back Button");
        backArrow.click();
    }

    public void verifyAndClickDeleteButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Delete Button is displayed");
        Logger.logStep("Verify Delete Button is displayed");
        deleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
        Thread.sleep(3000L);
    }
}
