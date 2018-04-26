package iOS.oneappiOSTests;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.testng.annotations.Test;

import iOS.pageobjects.*;

public class Devices extends iOS.utilities.Main{
	
	public Devices() throws MalformedURLException, InterruptedException
	{
		super();
	}
	DevicesPage DP=new DevicesPage(driver);
	
	 //Verify Devices tab existence
	@Test
	public void verifyDevicetab()
	{
		boolean actual=DP.verifydevices();
		Assert.assertSame(true, actual);
	}
}