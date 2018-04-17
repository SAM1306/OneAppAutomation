package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class AddAutomationFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AddAutomationScreen";

    public AddAutomationFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    public WebElement smartHomeMonitor;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_recommended_add_button")
    public WebElement customAutomationButton;

    public void verifySHMButtonIsPresent() {
        Logger.logStep("Verify SHM Button is displayed");
        assertTrue(smartHomeMonitor.isDisplayed());
    }

    public void clickSHMButton() {
        Logger.logStep("Click on SHM Button");
        smartHomeMonitor.click();
    }

    public SHMConfigurePage getSHMFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(smartHomeMonitor));
        return new SHMConfigurePage((AndroidDriver) driver);
    }

    public void verifyAndClickCustomAutomationButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Custom Automation Button is displayed");
        Logger.logStep("Verify Custom Automation Button is displayed");
        customAutomationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Custom Automation Button");
        Logger.logStep("Click on Custom Automation Button");
        customAutomationButton.click();
    }
}
