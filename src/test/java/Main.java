package OneAppiOSTests;
import java.io.File;

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

public class Main 
{
	File f=new File("/Users/surekhapentela/desktop/Automation/simulatorapp/SamsungConnect4iOS.app");
	DesiredCapabilities cap;
	IOSDriver driver;
	OneAppiOSTests.PageObjects p=new OneAppiOSTests.PageObjects();
	public Main() throws MalformedURLException, InterruptedException
	{
	    cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
		//cap.setCapability("xcodeSigningId", "iPhone Developer");//needed for iPhone Device
		//cap.setCapability("xcodeOrgId", "X3M3P7J4X7");//needed for iPhone Device
		cap.setCapability(MobileCapabilityType.UDID, "78758CDB-44C0-485E-B146-E37391E6FE3E"); //iPhone 7 Simulator
		//cap.setCapability(MobileCapabilityType.UDID, "301fdd117f2dd7d8dc22a5391fcc4406aeb3955c"); //iPhone X Device
		cap.setCapability(MobileCapabilityType.APP, f);
	    driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), cap);
	}	
	
	
	@Test
	public void CreateAutomation()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByName(p.Automations).click();
        driver.findElementByName(p.Addautomation).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElementByName(p.Customautomation).click();
		driver.findElementByName(p.Whendoyouwanttousethisautomation).click();
		driver.findElementByName(p.Basedonthislocationsmode).click();
		driver.findElementByName(p.Night).click();
		driver.findElementByName(p.Done).click();
		driver.findElementByName(p.Done).click();
		driver.findElementByName(p.Whatdoyouwantthisautomationtodo).click();
		driver.findElementByName(p.SYLVANIASmartA19RGBW).click();
		driver.findElementByName(p.Off).click();
		driver.findElementByName(p.Done).click();
		driver.findElementByName(p.Done).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByName(p.Save).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean actual=driver.findElementByName(p.LocationmodeNightAutomationtoggleenabled).isDisplayed();
		Assert.assertSame(true, actual);
	}
	
	@Test
	public void verifyAutomationtab()
	{
		boolean actual=driver.findElementByName(p.Automations).isDisplayed();
		Assert.assertSame(true, actual);
	}
	
	@Test
	public void verifyDashboardtab()
	{
		boolean actual=driver.findElementByName(p.Dashboard).isDisplayed();
		Assert.assertSame(true, actual);
	}
	
	@Test
	public void verifyDevicetab()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=driver.findElementByName(p.Devices).isDisplayed();
		Assert.assertSame(true, actual);
	}
	
	@Test
	public void VDeleteScenes()
	{
		driver.findElementByName("Devices").click();
		driver.findElementByName("More options").click();
		driver.findElementByName("Edit").click();
		driver.findElementByName("Test").click();
		driver.findElementByName("Delete scene").click();
		driver.findElementByName("DELETE").click();
		driver.findElementByName("Back").click();
		boolean actual=driver.findElements(By.name("Test")).isEmpty();
		Assert.assertSame(true, actual);
		
	}
}
	

