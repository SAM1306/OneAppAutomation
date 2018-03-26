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

public class Automation extends Main{
	
	public Automation() throws MalformedURLException, InterruptedException
	{
		super();
	}
	OneAppiOSTests.PageObjects p=new OneAppiOSTests.PageObjects();

	
	
	public void CreateAutomation()
	{
		super.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		super.driver.findElementByName(p.Automations).click();
		super.driver.findElementByName(p.Addautomation).click();
		super.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		super.driver.findElementByName(p.Customautomation).click();
		super.driver.findElementByName(p.Whendoyouwanttousethisautomation).click();
		super.driver.findElementByName(p.Basedonthislocationsmode).click();
		super.driver.findElementByName(p.Night).click();
		super.driver.findElementByName(p.Done).click();
		super.driver.findElementByName(p.Done).click();
		super.driver.findElementByName(p.Whatdoyouwantthisautomationtodo).click();
		super.driver.findElementByName(p.SYLVANIASmartA19RGBW).click();
		super.driver.findElementByName(p.Off).click();
		super.driver.findElementByName(p.Done).click();
		super.driver.findElementByName(p.Done).click();
		super.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		super.driver.findElementByName(p.Save).click();
		super.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean actual=super.driver.findElementByName(p.LocationmodeNightAutomationtoggleenabled).isDisplayed();
		Assert.assertSame(true, actual);
	}
	public void DeleteAutomation() //Ticket(oneapp-2667) filed for Delete iCon
	{
		
		super.driver.findElementByName(p.Automations).click();
		super.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		super.driver.findElementByName(p.Moreoptions).click();
		super.driver.findElementByName(p.Delete).click();
		//super.driver.findElementByClassName("MockiPhoneAccessibilityElement").click();
		boolean actual=super.driver.findElementByName(p.LocationmodeNight).isDisplayed();
		Assert.assertSame(false, actual);
	 }
	
	
	
	public void verifyAutomationtab()
	{
		boolean actual=super.driver.findElementByName(p.Automations).isDisplayed();
		Assert.assertSame(true, actual);
	}
	

	

}
