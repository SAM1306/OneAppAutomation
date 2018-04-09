package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import utility.Logger;

import static junit.framework.TestCase.assertTrue;

public class SmartthingsSettingsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SmartthingsSettingsScreen";

    public SmartthingsSettingsFragmentPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Samsung account']")
    public WebElement samsungAccount;

    public SmartthingsSettingsFragmentPage getSmartthingsSettingsFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(samsungAccount));
        return new SmartthingsSettingsFragmentPage((AndroidDriver) driver);
    }

    public void verifySamsungAccountTextIsDisplayed() {
        Logger.logStep("Verify Samsung Account text is displayed");
        assertTrue(samsungAccount.isDisplayed());
    }
}
