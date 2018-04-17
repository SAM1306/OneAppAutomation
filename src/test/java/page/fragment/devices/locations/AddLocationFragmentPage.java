package page.fragment.devices.locations;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class AddLocationFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "AddLocationScreen";

    public AddLocationFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/add_location_name_edit_text")
    public WebElement locationNameTextBox;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/remove_place_button")
    public WebElement deleteLocationButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Remove']")
    public WebElement removeLocationButton;


    public void verifyAndClickLocationNameTextBox() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Location Name Text Box is displayed");
        Logger.logStep("Verify Location Name Text Box is displayed");
        locationNameTextBox.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Location Name Text Box");
        Logger.logStep("Click on Location Name Text Box");
        locationNameTextBox.click();
    }

    public void addLocationName (String text) {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Adding \"" + text + "\" Location Name");
        Logger.logStep("Adding \"" + text + "\" Location Name");
        locationNameTextBox.sendKeys(text);
        driver.hideKeyboard();
    }

    public void verifyAndClickDeleteButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Delete Button is displayed");
        Logger.logStep("Verify Delete Button is displayed");
        deleteLocationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteLocationButton.click();
    }

    public void verifyAndClickRemoveButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Remove Button is displayed");
        Logger.logStep("Verify Remove Button is displayed");
        removeLocationButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Remove Button");
        Logger.logStep("Click on Remove Button");
        removeLocationButton.click();
    }
}
