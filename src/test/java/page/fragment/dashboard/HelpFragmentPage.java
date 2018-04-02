package page.fragment.dashboard;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

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
}
