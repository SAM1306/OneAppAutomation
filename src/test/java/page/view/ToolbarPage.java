package page.view;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class ToolbarPage extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public ToolbarPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "Navigate up")
    public WebElement backArrow;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_action_button")
    public WebElement deleteButton;
}
