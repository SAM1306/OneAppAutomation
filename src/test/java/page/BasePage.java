package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @AndroidFindBy(className = "android.webkit.WebView")
    private WebElement androidWebView;

    public AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;
    }

    public void loadPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public abstract String getScreenName();
}
