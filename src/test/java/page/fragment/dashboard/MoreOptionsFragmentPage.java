package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class MoreOptionsFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "MoreOptionsScreen";

    public MoreOptionsFragmentPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Settings']")
    public WebElement settingsButton;

    @AndroidFindBy(id = "//*[@class='android.widget.TextView' and @text='Manage Dashboard']")
    public WebElement manageDashbaord;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Delete']")
    public WebElement deleteButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Help']")
    public WebElement helpButton;

}
