package page.fragment.automations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class SHMConfigurePage extends BasePage {

    private static final String SCREEN_NAME = "SHMScreen";

    public SHMConfigurePage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='NEXT']")
    public WebElement nextButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='DONE']")
    public WebElement doneButton;

    @AndroidFindBy(id = "siren_duration")
    public WebElement sirenDurationTextBox;

    public SHMConfigurePage getSHMFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        return new SHMConfigurePage((AndroidDriver) driver);
    }

    public void verifyAndClickNextButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Next Button is displayed");
        Logger.logStep("Verify Next Button is displayed");
        nextButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Next Button");
        Logger.logStep("Click on Next Button");
        nextButton.click();
    }

    public void verifyAndClickDoneButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Done Button is displayed");
        Logger.logStep("Verify Done Button is displayed");
        doneButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Done Button");
        Logger.logStep("Click on Done Button");
        doneButton.click();
        Thread.sleep(2000L);
    }

    public void verifyAndClickSirenDurationTextBox() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Siren Duration Text Box is displayed");
        Logger.logStep("Verify Siren Duration Text Box is displayed");
        sirenDurationTextBox.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Siren Duration Text Box");
        Logger.logStep("Click on Siren Duration Text Box");
        sirenDurationTextBox.click();
    }

    public void addSirenDuration (String text) {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Adding \"" + text + "\" minute Siren Duration");
        Logger.logStep("Adding \"" + text + "\" minute Siren Duration");
        sirenDurationTextBox.sendKeys(text);
        driver.hideKeyboard();
    }
}
