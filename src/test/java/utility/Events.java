package utility;

import oneAppTests.TestCaseSetup;

public class Events {

    public static void scrollAndClick(String visibleText) {
        TestCaseSetup.getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }

    public static void scrollTo(String text) {
        TestCaseSetup.getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
    }

}
