package page.fragment.dashboard;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

import static org.testng.Assert.assertTrue;

public class HelpFragmentPage extends BasePage {

    private static final String SCREEN_NAME = "HelpScreen";

    public HelpFragmentPage(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/help_my_questions")
    public WebElement myQuestions;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/help_faq")
    public WebElement faq;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/help_ask_questions")
    public WebElement emailCustomerService;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/help_call_customer_service")
    public WebElement callCustomerService;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/help_report_a_problem")
    public WebElement reportProblem;

    public void verifyHelpMyQuestionIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Help My Question text is displayed");
        Logger.logStep("Verify Help My Question text is displayed");
        assertTrue(myQuestions.isDisplayed());
    }

    public void verifyFAQIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify FAQ is displayed");
        Logger.logStep("Verify FAQ is displayed");
        assertTrue(faq.isDisplayed());
    }

    public void verifyEmailCustomerServiceIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Email Customer Service is displayed");
        Logger.logStep("Verify Email Customer Service is displayed");
        assertTrue(emailCustomerService.isDisplayed());
    }

    public void verifyCallCustomerServiceIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Call Customer Service is displayed");
        Logger.logStep("Verify Call Customer Service is displayed");
        assertTrue(callCustomerService.isDisplayed());
    }

    public void verifyReportProblemIsDisplayed() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Report Problem is displayed");
        Logger.logStep("Verify Report Problem is displayed");
        assertTrue(reportProblem.isDisplayed());
    }
}
