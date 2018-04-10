package page.fragment.automations;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.Logger;

public class SHMFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SHMScreen";

    public SHMFragmentPage(AndroidDriver driver) {
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

    public SHMFragmentPage getSHMFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        return new SHMFragmentPage((AndroidDriver) driver);
    }

    public void verifyAndClickNextButton() {
        Logger.logStep("Verify Next Button is displayed");
        nextButton.isDisplayed();
        Logger.logStep("Click on Next Button");
        nextButton.click();
    }

    public void verifyAndClickDoneButton() throws InterruptedException {
        Logger.logStep("Verify Done Button is displayed");
        doneButton.isDisplayed();
        Logger.logStep("Click on Done Button");
        doneButton.click();
        Thread.sleep(2000L);
    }

    public void verifyAndClickSirenDurationTextBox() {
        Logger.logStep("Verify Siren Duration Text Box is displayed");
        sirenDurationTextBox.isDisplayed();
        Logger.logStep("Click on Siren Duration Text Box");
        sirenDurationTextBox.click();
    }

    public void addSirenDuration (String text) {
        Logger.logStep("Adding \"" + text + "\" minute Siren Duration");
        sirenDurationTextBox.sendKeys(text);
        driver.hideKeyboard();
    }
}
