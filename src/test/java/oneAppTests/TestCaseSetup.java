package oneAppTests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCaseSetup {

    private static AndroidDriver<MobileElement> INSTANCE;

    public static AndroidDriver<MobileElement> getDriver() {
        if (INSTANCE != null) {
            return INSTANCE;
        }

    DesiredCapabilities caps = new DesiredCapabilities();

    caps.setCapability("deviceName", "0738a0e100999b44");
    caps.setCapability("platformName", "Android");
    caps.setCapability("platformVersion", "6.0");
    caps.setCapability("appPackage", "com.samsung.android.oneconnect");
    caps.setCapability("appActivity", "com.samsung.android.oneconnect.ui.SCMainActivity");
    caps.setCapability("app", "/Users/sjain/Downloads/User_do_not_distribute_apt_SmartThings_smartThings_1.7.5_16_RC1_minApi_23_production_release.apk");
    caps.setCapability("noReset", "true");
    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
    caps.setCapability("autoAcceptAlerts", true);

        try {
            INSTANCE = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Could not initialize driver instance", e);
        }
        INSTANCE.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    return INSTANCE;
}
}
