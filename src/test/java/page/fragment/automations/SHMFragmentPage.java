package page.fragment.automations;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

public class SHMFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "SHMScreen";

    public SHMFragmentPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='NEXT']")
    public WebElement nextButton;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='DONE']")
    public WebElement doneButton;

    @AndroidFindBy(id = "siren_duration")
    public WebElement sirenDurationTextBox;

    public SHMFragmentPage getSHMFragmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(By
         //       .xpath("//*[@class='android.view.View' and @text='NEXT']")));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        return new SHMFragmentPage((AndroidDriver) driver);
    }
}
