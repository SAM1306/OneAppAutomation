package pages;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.DevicesPage;

public class Dashboard extends oneappiostests.Main
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