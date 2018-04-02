package page.fragment.devices.scenes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class AddSceneFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddSceneScreen";

    public AddSceneFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/edit_mode_name")
    public WebElement sceneNameTextBox;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/edit_mode_add_action_button")
    public WebElement addActionsButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/add_edit_mode_delete_mode_button")
    public WebElement deleteButton;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement confirmDeleteButton;

    @AndroidFindBy(accessibility = "Remove")
    public WebElement removeButton;
}
