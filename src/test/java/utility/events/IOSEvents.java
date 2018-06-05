package utility.events;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;

public class IOSEvents implements Events {

    private IOSDriver<?> driver;

    public IOSEvents(AppiumDriver<?> driver) {
        this.driver = (IOSDriver<?>) driver;
    }
    @Override
    public void scrollAndClick(String visibleText) {

    }

    @Override
    public void scrollTo(String text) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = driver;
        HashMap scrollObject = new HashMap();
        scrollObject.put("direction", "down");
        WebElement element = driver.findElementByAccessibilityId(text);
        scrollObject.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: swipe", scrollObject);
    }
}
