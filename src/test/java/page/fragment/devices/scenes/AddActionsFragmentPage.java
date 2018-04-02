package page.fragment.devices.scenes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class AddActionsFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddActionsScreen";

    public AddActionsFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Outlet']")
    public WebElement outletButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='On']")
    public WebElement onRadioButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/title_menu_2")
    public WebElement doneButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/save_menu")
    public WebElement saveButton;
}
