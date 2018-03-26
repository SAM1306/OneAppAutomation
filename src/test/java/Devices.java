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

public class Devices extends Main{
	
	OneAppiOSTests.PageObjects p=new OneAppiOSTests.PageObjects();
	
	public Devices() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	
	public void verifyDevicetab()
	{
		super.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=super.driver.findElementByName(p.Devices).isDisplayed();
		Assert.assertSame(true, actual);
		
	}
}

