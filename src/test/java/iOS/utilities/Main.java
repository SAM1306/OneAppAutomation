package iOS.utilities;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import iOS.pageobjects.AutomationsPage;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Main
{
	File f=new File("/Users/surekhapentela/desktop/Automation/simulatorapp/SamsungConnect4iOS.app");
	DesiredCapabilities cap;
	protected IOSDriver driver;
	
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
}