package iOS.oneappiOSTests;
import java.net.MalformedURLException;
import org.junit.Assert;
import org.testng.annotations.Test;
import iOS.pageobjects.*;

public class Devices extends iOS.utilities.Main
{
	DevicesPage dp=new DevicesPage(driver);
	public Devices() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	//Verify Devices tab existence
	@Test
	public void verifyDeviceTab()
	{
		boolean actual=dp.verifydevices();
		Assert.assertSame(true, actual);
	}
}