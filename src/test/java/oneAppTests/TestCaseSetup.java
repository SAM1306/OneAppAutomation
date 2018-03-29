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

    caps.setCapability("deviceName", "98895a413650373549");
    caps.setCapability("platformName", "Android");
    caps.setCapability("platformVersion", "7.0");
    caps.setCapability("appPackage", "com.samsung.android.oneconnect");
    caps.setCapability("appActivity", "com.samsung.android.oneconnect.ui.SCMainActivity");
    caps.setCapability("app", "/Users/smartthings/Downloads/User_apt_SmartThings_1.7.4_41_RC1_minApi_23_production_release.apk");
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
