package page.fragment;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

public class DevicesFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "DevicesFragmentScreen";

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

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add room']")
    public WebElement addRoomButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mode_name_new")
    public WebElement createdScene;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Spinner/android.widget.LinearLayout/android.widget.ImageView[2]")
    public WebElement deviceDropdown;

    @AndroidFindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Home']")
    public WebElement homeLocationButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Edit']")
    public WebElement editButton;


    public DevicesFragmentPage getDevicesFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(addSceneButton));
        return new DevicesFragmentPage((AndroidDriver) driver);
    }
}
