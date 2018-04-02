package page.fragment;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class RoomsFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "RoomsScreen";

    public RoomsFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Test Room']")
    public WebElement createdRoom;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/manage_devices_button")
    public WebElement manageDevicesButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/remove_place_button")
    public WebElement deleteRoomButton;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement confirmDeleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Multipurpose Sensor']")
    public WebElement verifyMultiPurposeSencor;


}
