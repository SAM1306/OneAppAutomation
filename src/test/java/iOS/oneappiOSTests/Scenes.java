package iOS.oneappiOSTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import iOS.utilities.*;
import iOS.pageobjects.*;


public class Scenes extends Main
{
	public Scenes() throws MalformedURLException, InterruptedException
	{
		super();
	}
	DevicesPage DP=new DevicesPage(driver);
	AutomationsPage AP = new AutomationsPage(driver);
	
	//Create Scenes
	@Test
	public void CreateScenes() 
	{
		DP.clickondevices();
		DP.clickonmoreoptions();
		DP.clickonaddscene();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DP.clickonAddactions();
		AP.clickonSYLVANIASmartA19RGBW();
		AP.clickonoff();
		AP.clickondone();
		DP.entertexttoscenename();
		AP.clickonsave();
		boolean actual=DP.verifytest();
		Assert.assertSame(false, actual);
	}
	
	//Delete Scenes
	@Test
	public void DeleteScenes()
	{
		DP.clickondevices();
		DP.clickonmoreoptions();
		DP.clickonedit();
		DP.clickontest();
		DP.clickondeletescene();
		DP.clickonDELETE();
		DP.clickonback();
		boolean actual=DP.verifytest();
		Assert.assertSame(true, actual);
	}
}