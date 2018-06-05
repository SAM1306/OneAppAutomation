package utility.events;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class EventsFactory {

    protected static AppiumDriver driver;

    public EventsFactory(AppiumDriver driver) {
        this.driver = driver;
    }

    public static Events getEvents(AppiumDriver<?> driver) {
        if (driver instanceof AndroidDriver) {
            return new AndroidEvents(driver);
        } else if (driver instanceof IOSDriver){
                return new IOSEvents(driver);
             }
         else {
            return null;
        }
    }
}
