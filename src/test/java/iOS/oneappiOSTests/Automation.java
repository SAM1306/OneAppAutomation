package iOS.oneappiOSTests;

import org.testng.annotations.Parameters;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import iOS.pageobjects.*;
import iOS.utilities.Main;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation extends Main
{
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	AutomationsPage ap=new AutomationsPage(driver);
	
	public Automation() throws MalformedURLException, InterruptedException 
	{
		super();
	}
	
	
	
	//Create Automation
	/*@Parameters({"Automations"})
	@Test
	public void createAutomation(String Automations)
	{
		ap.clickon(Automations);
		ap.clickonAddautomations();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ap.clickonCustomautomations();
		ap.clickonWhendoyouwanttousethisautomation();
		ap.clickonBasedonthislocationsmode();
		ap.clickonNight();
		ap.clickonDone();
		ap.clickonDone();
		ap.clickonWhatdoyouwantthisautomationtodo();
		ap.clickonSYLVANIASmartA19RGBW();
		ap.clickonOff();
		ap.clickonDone();
		ap.clickonDone();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		ap.clickonSave();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=ap.verifyLocationmodenightautomationtoggleenabled();
		Assert.assertSame(true, actual);
	}*/
	
	//Delete Automation
	@Parameters({"Automations","Moreoptions","Delete","LocationModeNightDelete"})
	@Test
	public void deleteAutomation( String Automations, String Moreoptions, String Delete,String LocationModeNightDelete) 
	{
		//Before Parameterization
		
		/*ap.clickonAutomations();
		ap.clickonMoreoptions();
		ap.clickonDelete();
		ap.clickonLocationModeNightDelete();
		ap.clickonDelete();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=driver.findElementByName("Location mode, Night").isDisplayed();
		Assert.assertSame(false, actual);*/
		
		
		//After Parameterization
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.Automations));
		ap.clickon(Automations);
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.Moreoptions));
		ap.clickon(Moreoptions);
		ap.clickon(Delete);
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.LocationmodeNightDelete));
		ap.clickon(LocationModeNightDelete);
		ap.clickon(Delete);
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.LocationmodeNight));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean actual=driver.findElementByName("Location mode, Night").isDisplayed();
		Assert.assertSame(false, actual);
	}
	
	//Verify Automation tab existence
	
	public void verifyAutomationtab()
	{
		boolean actual=ap.verifyAutomations();
		Assert.assertSame(true, actual);
	}
}