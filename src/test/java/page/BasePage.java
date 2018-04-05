package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void loadPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public abstract String getScreenName();
}
