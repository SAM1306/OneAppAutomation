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
	AutomationsPage ap=new AutomationsPage(driver);
	DashboardPage dp=new DashboardPage(driver);
	CatalogPage cp=new CatalogPage(driver);
	public Catalog() throws MalformedURLException, InterruptedException 
	{
		super();
	}
	
	//Catalog Screen Hierarchy Test
	@Test(priority=3)
	public void catalogScreenHierarchy()
	{
		dp.clickondashboard();
		dp.clickonadddevice();
		boolean actual=dp.verifyhubs() & dp.verifymoisturesensor() & dp.verifymotionsensor() & dp.verifymultifunctionalsensor();
		Assert.assertSame(true, actual);
	}
	
	//Automation Catalog Hierarchy Test
	@Test(priority=1)
	public void automationCatalogHierarchy(String Automations)
	{
		ap.clickonAutomations();
		ap.clickonAddautomations();
		boolean actual=cp.verifysmarthomemonitor() & cp.verifysmartthings() & cp.verifymonitoryourhomeforintrusions();
		Assert.assertSame(true, actual);
	}
	
	//Catalog - Installed Automations Display Test
	@Test(priority=2)
	public void catalogInstalledAutomationsDisplay()
	{
		//ap.clickonautomations();
		//ap.clickonaddautomations();
		cp.clickonsmarthomemonitor();
		wait.until(ExpectedConditions.presenceOfElementLocated(cp.Next));
		cp.clickonext();
		wait.until(ExpectedConditions.presenceOfElementLocated(cp.Next));
		cp.clickonext();
		wait.until(ExpectedConditions.presenceOfElementLocated(cp.DONE));
		cp.clickonDONE();
		wait.until(ExpectedConditions.presenceOfElementLocated(cp.Allow));
		cp.clickonallow();
		wait.until(ExpectedConditions.presenceOfElementLocated(cp.Smarthomemonitordisplay));
		boolean actual= cp.verifysmarthomemonitordisplay();
		Assert.assertSame(true, actual);
	}
}
	

