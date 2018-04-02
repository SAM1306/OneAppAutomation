package page.fragment.automations;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

public class AddAutomationFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "AddAutomationScreen";

    public AddAutomationFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")
    public WebElement smartHomeMonitor;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_recommended_add_button")
    public WebElement customAutomationButton;

    public SHMFragmentPage getSHMFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(By
          //      .xpath("//*[@class='android.widget.TextView' and @text='Smart Home Monitor']")));
        wait.until(ExpectedConditions.elementToBeClickable(smartHomeMonitor));
        return new SHMFragmentPage((AndroidDriver) driver);
    }
}
