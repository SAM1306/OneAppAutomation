package page.fragment;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

public class DevicesFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "DashboardScreen";

    public DevicesFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "More options")
    public WebElement moreOptionsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add scene']")
    public WebElement addSceneButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mode_name_new")
    public WebElement createdScene;

    public DevicesFragmentPage getDevicesFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(addSceneButton));
        return new DevicesFragmentPage((AndroidDriver) driver);
    }
}
