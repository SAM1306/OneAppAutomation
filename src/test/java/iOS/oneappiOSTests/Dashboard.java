package iOS.oneappiOSTests;
import java.net.MalformedURLException;
import org.junit.Assert;
import org.testng.annotations.Test;
import iOS.utilities.Main;
import iOS.pageobjects.*;

public class Dashboard extends Main
{
	DashboardPage dp=new DashboardPage(driver);
	public Dashboard() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	//Verify Dashboard tab existence
	@Test
	public void verifyDashboardTab()
	{
		boolean actual=dp.verifydashboard();
		Assert.assertSame(true, actual);
	}
}