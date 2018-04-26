package iOS.oneappiOSTests;
import java.net.MalformedURLException;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import iOS.pageobjects.*;

import iOS.utilities.Main;

public class Catalog extends Main
{
	WebDriverWait wait = new WebDriverWait(driver, 30);
    
	public Catalog() throws MalformedURLException, InterruptedException 
	{
		super();
	}
	
	AutomationsPage AP=new AutomationsPage(driver);
	DashboardPage DP=new DashboardPage(driver);
	DevicesPage DP1=new DevicesPage(driver);
	
	//Catalog Screen Hierarchy Test
	@Test(priority=3)
	public void catalogScreenHierarchy()
	{
		DP.clickondashboard();
		DP.clickonadddevice();
		boolean actual=DP.verifyhubs() & DP.verifymoisturesensor() & DP.verifymotionsensor() & DP.verifymultifunctionalsensor();
		Assert.assertSame(true, actual);
	}
	
	
	//Automation Catalog Hierarchy Test
	@Test(priority=1)
	public void automationcataloghierarchy()
	{
		AP.clickonautomations();
		AP.clickonaddautomations();
		boolean actual=AP.verifysmarthomemonitor() & AP.verifysmartthings() & AP.verifymonitoryourhomeforintrusions();
		Assert.assertSame(true, actual);
	}
	
	//Catalog - Installed Automations Display Test
	@Test(priority=2)
	public void cataloginstalledautomationsdisplay()
	{
		//AP.clickonautomations();
		//AP.clickonaddautomations();
		AP.clickonsmarthomemonitor();
		wait.until(ExpectedConditions.presenceOfElementLocated(AP.Next));
		AP.clickonext();
		wait.until(ExpectedConditions.presenceOfElementLocated(AP.Next));
		AP.clickonext();
		wait.until(ExpectedConditions.presenceOfElementLocated(AP.DONE));
		AP.clickonDONE();
		wait.until(ExpectedConditions.presenceOfElementLocated(AP.Allow));
		AP.clickonallow();
		wait.until(ExpectedConditions.presenceOfElementLocated(AP.Smarthomemonitordisplay));
		boolean actual= AP.verifysmarthomemonitordisplay();
		Assert.assertSame(true, actual);
	}
}
	

