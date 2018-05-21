package utility.events;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidEvents implements Events {

    private AndroidDriver<?> driver;

    public AndroidEvents(AppiumDriver<?> driver) {
        this.driver = (AndroidDriver<?>) driver;
    }

    @Override
    public void scrollAndClick(String visibleText) {
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
    }

    @Override
    public void scrollTo(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
    }
}
