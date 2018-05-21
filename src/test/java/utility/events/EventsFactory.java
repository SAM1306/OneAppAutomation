package utility.events;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class EventsFactory {

    public static Events getEvents(AppiumDriver<?> driver) {
        if (driver instanceof AndroidDriver) {
            return new AndroidEvents(driver);
        } else {
            return null;
        }
    }
}
