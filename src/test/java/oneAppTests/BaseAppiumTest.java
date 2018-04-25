package oneAppTests;

import android.test.suitebuilder.annotation.LargeTest;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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

    public abstract String getTestName();

    public WebDriver getDriver() {
        return driver;
    }
}
