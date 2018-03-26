package utility;

import io.appium.java_client.android.AndroidDriver;

public class Events {

    static AndroidDriver driver;

    public static void scrollAndClick(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }

    public static void scrollTo(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
    }

}
