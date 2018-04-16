package pages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageobjects.AutomationsPage;

public class Automation extends oneappiostests.Main
{
	public Automation() throws MalformedURLException, InterruptedException 
	{
		super();
	}
	AutomationsPage AP=new AutomationsPage(driver);
	
	//Create Automation
	@Test
	public void CreateAutomation()
	{
		AP.clickonautomations();
		AP.clickonaddautomations();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AP.clickoncustomautomations();
		AP.clickonwhendoyouwanttousethisautomation();
		AP.clickonbasedonthislocationsmode();
		AP.clickonnight();
		AP.clickondone();
		AP.clickondone();
		AP.clickonwhatdoyouwantthisautomationtodo();
		AP.clickonSYLVANIASmartA19RGBW();
		AP.clickonoff();
		AP.clickondone();
		AP.clickondone();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		AP.clickonsave();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=AP.verifyLocationmodeNightAutomationtoggleenabled();
		Assert.assertSame(true, actual);
	}
	
	//Delete Automation
	
	public void DeleteAutomation() 
	{
		AP.clickonautomations();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AP.clickonmoreoptions();
		AP.clickondelete();
		AP.clickonLocationmodeNightDelete();
		AP.clickondelete();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=driver.findElementByName("Location mode, Night").isDisplayed();
		Assert.assertSame(false, actual);
	}
	
	//Verify Automation tab existence
	
	public void verifyAutomationtab()
	{
		boolean actual=AP.verifyautomations();
		Assert.assertSame(true, actual);
	}
}