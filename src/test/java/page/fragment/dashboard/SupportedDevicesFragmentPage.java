package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

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
}
