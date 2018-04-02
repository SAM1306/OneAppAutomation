package page.fragment;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class AddRoomFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddRoomScreen";

    public AddRoomFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/add_group_name_edit_text")
    public WebElement roomNameTextBox;

    @AndroidFindBy(accessibility = "Multipurpose Sensor, Not selected")
    public WebElement multiPurposeSensorButton;

    @AndroidFindBy(accessibility = "Outlet, Not selected")
    public WebElement outletButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/save_menu")
    public WebElement saveButton;
}


