package OneAppiOSTests;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scenes extends Main
{
	OneAppiOSTests.PageObjects p=new OneAppiOSTests.PageObjects();
	
	public Scenes() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	public void CreateScenes() //Ticket(oneapp-2617) filed for Name Text field
	{
		super.driver.findElementByName(p.Devices).click();
		super.driver.findElementByName(p.Moreoptions).click();
		super.driver.findElementByName(p.Addscene).click();
		//driver.findElementByName("Name").sendKeys("Test");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//boolean actual=driver.findElementByClassName("UIAccessibilityTextFieldElement").isDisplayed();
		//System.out.println(actual);
		super.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		super.driver.findElementByName(p.Name).click();
	}
	
	
	public void DeleteScenes()
	{
		super.driver.findElementByName("Devices").click();
		super.driver.findElementByName("More options").click();
		super.driver.findElementByName("Edit").click();
		super.driver.findElementByName("Test").click();
		super.driver.findElementByName("Delete scene").click();
		super.driver.findElementByName("DELETE").click();
		super.driver.findElementByName("Back").click();
		boolean actual=super.driver.findElements(By.name("Test")).isEmpty();
		Assert.assertSame(true, actual);
		
	}
}
