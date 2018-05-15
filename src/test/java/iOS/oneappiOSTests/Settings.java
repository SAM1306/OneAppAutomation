package iOS.oneappiOSTests;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import iOS.utilities.Main;
import iOS.pageobjects.*;

public class Settings extends Main
{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	DashboardPage dp=new DashboardPage(driver);
	DevicesPage dp1=new DevicesPage(driver);
	AutomationsPage ap=new AutomationsPage(driver);
	SettingsPage sp=new SettingsPage(driver);
	public Settings() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	//Use Location Information Test
	@Test
	public void useLocationInformation()
	{
		dp.clickondashboard();
		dp1.clickonmoreoptions();
		sp.clickonsettings();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(dp.Uselocationinformation));
		boolean actual=dp.verifyuselocationinfromation();
		Assert.assertSame(true, actual);
		dp1.clickonback();
	}
	
	//Device Controller Auto-Update Test
	@Test
	public void deviceControllerAutoUpdate()
	{
		dp.clickondashboard();
		dp1.clickonmoreoptions();
		sp.clickonsettings();
		wait.until(ExpectedConditions.presenceOfElementLocated(dp.Autoupdatedevicecontroller));
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		dp.clickonautoupdatedevicecontroller();
		boolean actual=ap.verifyOff() & dp.verifywifionly() & dp.verifywifiormobile();
		Assert.assertSame(true, actual);
	}
}
