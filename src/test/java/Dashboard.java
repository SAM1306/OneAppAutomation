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

public class Dashboard extends Main{
	OneAppiOSTests.PageObjects p=new OneAppiOSTests.PageObjects();
	
	public Dashboard() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	
	public void verifyDashboardtab()
	{
		boolean actual=super.driver.findElementByName(p.Dashboard).isDisplayed();
		Assert.assertSame(true, actual);
	}
	
	public void EditManageDashboard()//Ticket(oneapp-2621) filed for Show all cards option/toggle button
	{
		super.driver.findElementByName(p.Dashboard).click();
		super.driver.findElementByName(p.Moreoptions).click();
		super.driver.findElementByName(p.Managedashboard).click();
	}
}




