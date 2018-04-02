package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class DashboardFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public DashboardFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "SmartThings")
    public WebElement smartthingsLogo;

    @AndroidFindBy(accessibility = "More options")
    public WebElement moreOptions;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/moving_box")
    public WebElement creatingSceneTiles;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/sc_main_location_image")
    public WebElement homeTile;


    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mainLabel")
    public WebElement addDevicesTile;


    @AndroidFindBy(accessibility = "Supported devices Button")
    public WebElement supportedDevicesTiles;

    @AndroidFindBy(id = "com.31 `samsung.android.oneconnect:id/dummyLayout")
    public WebElement howToUseTile;

    @AndroidFindBy(accessibility = "Scene information")
    public WebElement sceneInfoButton;
}

