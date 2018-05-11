package oneAppTests;

import android.test.suitebuilder.annotation.LargeTest;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utility.ExtentReports.ExtentTestManager;

@LargeTest
public abstract class BaseAppiumTest {

    public static AppiumDriver DRIVER = TestCaseSetup.getDriver();

    public AppiumDriver driver = DRIVER;

    @BeforeClass
    protected void setup() {
    }

    @AfterClass
    public void teardown () {
    }

    @BeforeTest
    public void startTest(final ITestContext iTestContext) {
        ExtentTestManager.startTest(iTestContext.getName(),"");
    }

    public abstract String getTestName();

    public WebDriver getDriver() {
        return driver;
    }
}
