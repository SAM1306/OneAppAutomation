package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AutomationsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public AutomationsFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_textview_title")
    public WebElement automationsTitle;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_add_rule")
    public WebElement addAutomationButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_how_to_use")
    public WebElement howToUseAutomations;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    public WebElement smartHomeMonitorButton;

    public void verifyAutomationPageTitleIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Automation Page Title is displayed");
        Logger.logStep("Verify Automation Page Title is displayed");
        automationsTitle.isDisplayed();
    }

    public void verifyAndClickAddAutomationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Automation Button is displayed");
        Logger.logStep("Verify Add Automation Button is displayed");
        addAutomationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Automation Button");
        Logger.logStep("Click on Add Automation Button");
        addAutomationButton.click();
    }

    public void verifyAndClickSHMButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify SHM Button is displayed");
        Logger.logStep("Verify SHM Button is displayed");
        smartHomeMonitorButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on SHM Button");
        Logger.logStep("Click on SHM Button");
        smartHomeMonitorButton.click();
    }
}
