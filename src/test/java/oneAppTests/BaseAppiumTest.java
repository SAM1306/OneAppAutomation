package oneAppTests;

import android.test.suitebuilder.annotation.LargeTest;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.CustomTestRunner;
import utility.AutomationConstants;
import utility.Logger;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@LargeTest
@RunWith(CustomTestRunner.class)
public abstract class BaseAppiumTest {

    private static AndroidDriver driver;
    private static  WebDriverWait driverWait;

    private static final String CONTEXT_NATIVE_APP = "NATIVE_APP";
    private static String CONTEXT_WEBVIEW;

    public static boolean nativeContext;

    @Before
    public void setup() {
    }

    @After
    public void teardown() {
    }

    @Rule
    public TestName name = new TestName() {
        public String getMethodName() {
            return String.format("%s", super.getMethodName());
        }
    };

    public abstract String getTestName();

    /**
     * Waits for an element to load on screen
     * @param elementID id of element that needs to load
     * @throws Exception
     */
    public static void waitForElementToLoadByID(String elementID) throws Exception {
        Logger.logAction(String.format("Waiting for Element with ID '%s' to load", elementID));
        driverWait = new WebDriverWait(driver, AutomationConstants.WAIT_TIME_3S);
        int retries = 1;

        //waiting for an element, retrying few times before we declare element not found.
        while (true) {
            try {
                driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementID)));
                Logger.logComment(String.format("Found element with ID: %s", elementID));
                return;
            } catch (Exception elementDidNotLoad) {
                Logger.logWarning(String.format("Element with ID '%s' did not load after %d secs, after %d re-try", elementID, AutomationConstants.WAIT_TIME_10S, retries));
            }
            retries++;

            // terminating loop if retries complete
            if (retries > AutomationConstants.RE_TRY_3) {
                throw new Exception(String.format("Could not locate Element with ID '%s' after %d re-tries", elementID, AutomationConstants.RE_TRY_3));
            }
        }
    }

    /**
     * Finds element on screen with id.
     * @param elementID - string value of id
     * @return - WebElement
     * @throws Exception if id not located on screen
     */
    public static WebElement findElementByID(String elementID) throws Exception {
        Logger.logAction(String.format("Finding Element with ID '%s'", elementID));
        WebElement element ;
        try {
            element = driver.findElement(By.id(elementID));
        } catch (Exception elementNotFound) {
            throw new Exception(String.format("Element with ID '%s' not found", elementID));
        }
        return element;
    }

    /**
     * Finds element on screen with id and clicks it
     * @param elementID element to be clicked.
     * @throws Exception if id not found
     */
    protected static void findElementAndClickByID(String elementID) throws Exception {
        WebElement element = findElementByID(elementID);
        element.click();
    }


    /**
     * Find an element using its classname and text
     * @param className - class name of element
     * @param elementText - text of element
     * @return - WebElement
     * @throws Exception if no elements found
     */
    protected static WebElement findElementByClassAndText(String className, String elementText) throws Exception {
        List<WebElement> elementList = driver.findElementsByClassName(className);

        for(WebElement element : elementList) {
            if (element.getText().contains(elementText)) {
                return element;
            }
        }
        throw new Exception(String.format("Element with classname '%s' and text '%s' not found", className, elementText));
    }

    /**
     * Find and click an element using classname and text
     * @param className  - class name of element
     * @param elementText - text of element
     * @throws Exception if no elements found
     */
    protected static void findAndClickElementByClassAndText(String className, String elementText) throws Exception {
        WebElement element = findElementByClassAndText(className, elementText);
        element.click();
    }

    /**
     * Finds element on screen with CSS.
     * @param elementCSS - string value of CSS
     * @return - WebElement
     * @throws Exception if CSS not located on screen
     */
    protected static WebElement findElementByCSS(String elementCSS) throws Exception {
        Logger.logAction(String.format("Finding Element with CSS '%s'", elementCSS));
        WebElement element ;
        try {
            element = driver.findElement(By.cssSelector(elementCSS));
        } catch (Exception elementNotFound) {
            throw new Exception(String.format("Element with CSS '%s' not found", elementCSS));
        }
        return element;
    }

    /**
     * Finds element on screen with CSS and clicks it
     * @param elementCSS element with CSS to be clicked.
     * @throws Exception if CSS not found
     */
    protected static void findElementAndClickByCSS(String elementCSS) throws Exception {
        WebElement element = findElementByCSS(elementCSS);
        element.click();
    }

    /**
     * Finds element on screen with xpath.
     * @param elementXpath - string value of xpath
     * @return - WebElement
     * @throws Exception if xpath not located on screen
     */
    protected static WebElement findElementByXpath(String elementXpath) throws Exception {
        Logger.logAction(String.format("Finding Element with Xpath '%s'", elementXpath));
        WebElement element ;
        try {
            element = driver.findElement(By.cssSelector(elementXpath));
        } catch (Exception elementNotFound) {
            throw new Exception(String.format("Element with Xpath '%s' not found", elementXpath));
        }
        return element;
    }

    /**
     * Finds element on screen with xpath and clicks it
     * @param elementXpath element with xpath to be clicked.
     * @throws Exception if xpath not found
     */
    protected static void findElementAndClickByXpath(String elementXpath) throws Exception {
        WebElement element = findElementByCSS(elementXpath);
        element.click();
    }

    /**
     * Finds element on screen with link text.
     * @param elementLinkText - string value of link text
     * @return - WebElement
     * @throws Exception if link text not located on screen
     */
    protected static WebElement findElementByLinkText(String elementLinkText) throws Exception {
        Logger.logAction(String.format("Finding Element with Link Text '%s'", elementLinkText));
        WebElement element ;
        try {
            element = driver.findElement(By.cssSelector(elementLinkText));
        } catch (Exception elementNotFound) {
            throw new Exception(String.format("Element with Link Text '%s' not found", elementLinkText));
        }
        return element;
    }

    /**
     * Finds element on screen with link text and clicks it
     * @param elementLinkText element with link text to be clicked.
     * @throws Exception if link text not found
     */
    protected static void findElementAndClickByLinkText(String elementLinkText) throws Exception {
        WebElement element = findElementByLinkText(elementLinkText);
        element.click();
    }

    /**
     * Find element by CSS that is within a parent element having an id.
     * @param elementByID id of parent element
     * @param elementCSS css of element to be found
     * @return WebElement
     * @throws Exception if element not found
     */
    protected static WebElement findElementByIDAndCSS(String elementByID, String elementCSS) throws Exception {
        WebElement parentElement = findElementByID(elementByID);
        WebElement element;

        try {
            element = parentElement.findElement(By.cssSelector(elementCSS));
            return element;
        } catch (Exception ex) {
            throw new Exception(String.format("Did not find any element with css '%s' within parent element ID '%s'", elementCSS, elementByID));
        }
    }

    /**
     * Find all elements with the same id
     * @param id - id of the elements
     * @return list of all elements found
     * @throws Exception
     */
    protected static List<WebElement> findElementsByID(String id) throws Exception {
        List<WebElement> elementList = driver.findElementsById(id);
        return elementList;
    }

    /**
     * Find all elements with same class name
     * @param className - class name of elements
     * @return - list of all elements found
     * @throws Exception
     */
    public static List<WebElement> findElementsByClassName(String className) throws Exception {
        List<WebElement> elementList = driver.findElementsByClassName(className);
        return elementList;
    }

    /**
     * Switch to native app. Use before interacting with native app
     * @throws Exception
     */
    public static void useNativeContext() throws Exception {
        if (driver.getContext().contains(CONTEXT_NATIVE_APP)) {
            Logger.logWarning("Already native context");
        } else {
            driver.context(CONTEXT_NATIVE_APP);
            getNativeContext();
        }
    }

    /**
     * Switch to web view. Use before interacting with web app
     * @throws Exception
     */
    public static void useWebContext() throws Exception {
        if (driver.getContext().contains(CONTEXT_WEBVIEW)) {
            Logger.logWarning(String.format("Already web context: %s", CONTEXT_WEBVIEW));
        } else {
            driver.context(CONTEXT_WEBVIEW);
            getNativeContext();
        }
    }

    /**
     * Get the native context flag.
     * @return true if native context, ele false
     * @throws Exception
     */
    public static boolean getNativeContext() throws Exception {
        return nativeContext = driver.getContext().contains(CONTEXT_NATIVE_APP);
    }

    /**
     * To scroll to an element within a webview
     * @param element - expected element
     * @throws Exception
     */
    protected static void scrollToElementInBrowser(WebElement element) throws Exception {
        useWebContext();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    /**
     * Waits for web view page to load.
     * @throws Exception if page not loaded in 2 mins
     */
    protected static void waitForPageToLoad() throws Exception {
        useWebContext();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Date twoMinutesFromNow = new Date(Calendar.getInstance().getTimeInMillis() + AutomationConstants.WAIT_TIME_120_MS);

        while (!js.executeScript("return document.readyState").equals("complete")) {
            driverWait.withTimeout(3, TimeUnit.SECONDS);

            if (new Date().after(twoMinutesFromNow)) {
                throw new Exception(String.format("Waited for %d milli seconds but page load not complete", AutomationConstants.WAIT_TIME_120_MS));
            }
        }
    }
}
