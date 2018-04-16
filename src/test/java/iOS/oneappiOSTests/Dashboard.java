package iOS.oneappiOSTests;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.testng.annotations.Test;

import iOS.utilities.Main;
import iOS.pageobjects.*;


public class Dashboard extends Main
{
	public Dashboard() throws MalformedURLException, InterruptedException
	{
		super();
	}
	DashboardPage DP=new DashboardPage(driver);
	DevicesPage DP1=new DevicesPage(driver);
	
	//Verify Dashboard tab existence
	@Test
	public void verifyDashboardtab()
	{
		boolean actual=DP.verifydashboard();
		Assert.assertSame(true, actual);
	}
}