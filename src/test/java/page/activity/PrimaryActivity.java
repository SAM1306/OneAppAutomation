package page.activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

public class PrimaryActivity extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public PrimaryActivity(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Dashboard']")
    public WebElement dashboardButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Devices' and @resource-id='com.samsung.android.oneconnect:id/tab_text']")
    public WebElement devicesButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Automations']")
    public WebElement automationsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Delete']")
    public WebElement popUpDeleteButton;

    public void getDashboardButton() throws InterruptedException {
        Logger.logStep("Verify Dashboard Button is displayed");
        dashboardButton.isDisplayed();
        Logger.logStep("Click on Dashboard Button");
        dashboardButton.click();
        Thread.sleep(4000L);
    }

    public void getDevicesButton() throws InterruptedException {
        Logger.logStep("Verify Devices Button is displayed");
        devicesButton.isDisplayed();
        Logger.logStep("Click on Devices Button");
        devicesButton.click();
        Thread.sleep(4000L);
    }

    public void getAutomationsButton() throws InterruptedException {
        Logger.logStep("Verify Automations Button is displayed");
        automationsButton.isDisplayed();
        Logger.logStep("Click on Automations Button");
        automationsButton.click();
        Thread.sleep(4000L);
    }

    public void verifyAndClickPopUpDeleteButton() {
        Logger.logStep("Verify Pop Up is displayed");
        popUpDeleteButton.isDisplayed();
        Logger.logStep("Click on Pop Up Button");
        popUpDeleteButton.click();
    }
}
