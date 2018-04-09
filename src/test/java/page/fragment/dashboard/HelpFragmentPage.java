package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

import static junit.framework.TestCase.assertTrue;

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
        Logger.logStep("Verify Help My Question text is displayed");
        assertTrue(myQuestions.isDisplayed());
    }

    public void verifyFAQIsDisplayed() {
        Logger.logStep("Verify FAQ is displayed");
        assertTrue(faq.isDisplayed());
    }

    public void verifyEmailCustomerServiceIsDisplayed() {
        Logger.logStep("Verify Email Customer Service is displayed");
        assertTrue(emailCustomerService.isDisplayed());
    }

    public void verifyCallCustomerServiceIsDisplayed() {
        Logger.logStep("Verify Call Cusotmer Service is displayed");
        assertTrue(callCustomerService.isDisplayed());
    }

    public void verifyReportProblemIsDisplayed() {
        Logger.logStep("Verify Report Problem is displayed");
        assertTrue(reportProblem.isDisplayed());
    }
}
