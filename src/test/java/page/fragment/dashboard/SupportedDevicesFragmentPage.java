package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class SupportedDevicesFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SupportedDevicesScreen";

    public SupportedDevicesFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/actionbar_title")
    public WebElement supportedDeviceTitle;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/easysetup_search_view")
    public WebElement searchBar;

    public void verifySearchBarIsPresent() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Search Bar is displayed");
        Logger.logStep("Verify Search Bar is displayed");
        assertTrue(searchBar.isDisplayed());
    }
}
