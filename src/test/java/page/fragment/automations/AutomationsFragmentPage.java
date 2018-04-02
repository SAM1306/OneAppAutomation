package page.fragment.automations;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class AutomationsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AutomationScreen";

    public AutomationsFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_textview_title")
    public WebElement automationsTitle;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_add_rule")
    public WebElement addAutomationButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_how_to_use")
    public WebElement howToUseAutomations;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    public WebElement smartHomeMonitorButton;
}
