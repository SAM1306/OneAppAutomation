package oneAppTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestCaseSetup {

    public static String readProperty(String property) {
        Properties prop;
        String value = null;
        try {
            prop = new Properties();
            prop.load(new FileInputStream(new File("config.properties")));

            value = prop.getProperty(property);

            if (value == null || value.isEmpty()) {
                throw new Exception("Value not set or empty");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }

    public static AppiumDriver<?> getDriver() {
        AppiumDriver<?> driver;
        DesiredCapabilities caps = new DesiredCapabilities();

        if (Boolean.parseBoolean(TestCaseSetup.readProperty("run.hybrid"))) {
            caps.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
        }

        String completeURL = "http://" + TestCaseSetup.readProperty("run.ip") + ":" + TestCaseSetup.readProperty("run.port") + "/wd/hub";
        String platform = System.getProperty("platformName");

        switch (platform) {

            case "IOS":
                caps.setCapability(MobileCapabilityType.APP, new File(TestCaseSetup.readProperty("app.ios.path")).getAbsolutePath());
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, TestCaseSetup.readProperty("device.ios.name"));
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, TestCaseSetup.readProperty("platform.ios.version"));
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                caps.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.IOS);

                if ( Boolean.parseBoolean(TestCaseSetup.readProperty("platform.ios.xcode8"))) {
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                }

                driver = new IOSDriver<RemoteWebElement>(toUrl(completeURL), caps);
                break;

            case "Android":

                caps.setCapability("deviceName", System.getProperty("deviceName"));
                caps.setCapability("platformName", System.getProperty("platformName"));
                caps.setCapability("platformVersion", System.getProperty("platformVersion"));
                caps.setCapability("appPackage", System.getProperty("appPackage"));
                caps.setCapability("appActivity", System.getProperty("appActivity"));
                caps.setCapability("app", System.getProperty("app"));
                caps.setCapability("noReset", System.getProperty("noReset"));
                caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
                caps.setCapability("autoAcceptAlerts", true);

                driver = new AndroidDriver<RemoteWebElement>(toUrl(completeURL), caps);
                break;

            default:
                throw new IllegalArgumentException(String.format("Platform %s not supported", platform));
        }

        return driver;
    }

    private static URL toUrl(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(String.format("Url [%s] is malformed", url));
        }
    }
}
