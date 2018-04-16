package pages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import oneappiostests.Main;
import pageobjects.DevicesPage;

public class Devices extends Main{
	
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