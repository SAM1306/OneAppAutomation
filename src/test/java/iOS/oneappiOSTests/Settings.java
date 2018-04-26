package iOS.oneappiOSTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import iOS.utilities.Main;
import iOS.pageobjects.*;

public class Settings extends Main
{
	public Settings() throws MalformedURLException, InterruptedException
	{
		super();
	}
	DashboardPage DP=new DashboardPage(driver);
	DevicesPage DP1=new DevicesPage(driver);
	AutomationsPage AP=new AutomationsPage(driver);
	
	//Use Location Information Test
	//@Test
	public void useLocationInformation()
	{
		DP.clickondashboard();
		DP1.clickonmoreoptions();
		DP.clickonsettings();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		boolean actual=DP.verifyuselocationinfromation();
		Assert.assertSame(true, actual);
		DP1.clickonback();
	}
	
	//Device Controller Auto-Update Test
	@Test
	public void deviceControllerAutoUpdate()
	{
		DP.clickondashboard();
		DP1.clickonmoreoptions();
		DP.clickonsettings();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		DP.clickonautoupdatedevicecontroller();
		boolean actual=AP.verifyoff() & DP.verifywifionly() & DP.verifywifiormobile();
		Assert.assertSame(true, actual);
	}

}
