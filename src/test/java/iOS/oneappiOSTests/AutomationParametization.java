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
public class AutomationParametization extends Main
{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	AutomationsPage ap=new AutomationsPage(driver);
	AutomationsPageParameterization app=new AutomationsPageParameterization(driver);
	
	public AutomationParametization() throws MalformedURLException, InterruptedException 
	{
		super();
	}
	
	//Create Automation
	@Parameters({"Automations"})
	@Test(priority=1)
	public void createAutomation(String Automations)
	{
		app.clickon(Automations);
		ap.clickonAddautomations();
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.Customautomation));
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
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.Save));
		ap.clickonSave();
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.LocationmodeNightAutomationtoggleenabled));
		boolean actual=ap.verifyLocationmodenightautomationtoggleenabled();
		Assert.assertSame(true, actual);
	}
	
	//Delete Automation
	@Parameters({"Automations","Moreoptions","Delete","LocationModeNightDelete"})
	@Test(priority=2)
	public void deleteAutomation( String Automations, String Moreoptions, String Delete,String LocationModeNightDelete) 
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.Automations));
		app.clickon(Automations);
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.Moreoptions));
		app.clickon(Moreoptions);
		app.clickon(Delete);
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.LocationmodeNightDelete));
		app.clickon(LocationModeNightDelete);
		app.clickon(Delete);
		wait.until(ExpectedConditions.presenceOfElementLocated(ap.LocationmodeNight));
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
