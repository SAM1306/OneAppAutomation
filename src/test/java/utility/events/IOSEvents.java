package utility.events;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

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
//        JavascriptExecutor js = driver;
//        HashMap scrollObject = new HashMap();
//        scrollObject.put("direction", "down");
//        scrollObject.put("name", text);
//        js.executeScript("mobile: scroll", scrollObject);
    }
}
