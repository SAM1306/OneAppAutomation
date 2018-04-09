package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

public class MoreOptionsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "MoreOptionsScreen";

    public MoreOptionsFragmentPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Settings']")
    public WebElement settingsButton;

    @AndroidFindBy(id = "//*[@class='android.widget.TextView' and @text='Manage Dashboard']")
    public WebElement manageDashbaord;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Delete']")
    public WebElement deleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Help']")
    public WebElement helpButton;

    public void verifyAndClickSettingssButton() {
        Logger.logStep("Verify Settings Button is displayed");
        settingsButton.isDisplayed();
        Logger.logStep("Click on Settings Button");
        settingsButton.click();
    }

    public void verifyAndClickHelpButton() {
        Logger.logStep("Verify Help Button is displayed");
        helpButton.isDisplayed();
        Logger.logStep("Click on Help Button");
        helpButton.click();
    }

    public void verifyAndClickDeleteButton() {
        Logger.logStep("Verify More Options Button is displayed");
        deleteButton.isDisplayed();
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
    }

    public void verifyAndClickManageDashboardButton() {
        Logger.logStep("Verify Manage Dashboard Button is displayed");
        manageDashbaord.isDisplayed();
        Logger.logStep("Click on Manage Dashboard Button");
        manageDashbaord.click();
    }

}
