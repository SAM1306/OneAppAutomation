package oneAppTests;

import android.test.suitebuilder.annotation.LargeTest;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import page.CustomTestRunner;

@LargeTest
@RunWith(CustomTestRunner.class)
public abstract class BaseAppiumTest {

    private static AndroidDriver driver;

    @Before
    public void setup() {
    }

    @After
    public void teardown() {
    }

    @Rule
    public TestName name = new TestName() {
        public String getMethodName() {
            return String.format("%s", super.getMethodName());
        }
    };

    public abstract String getTestName();
}
