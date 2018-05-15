package iOS.oneappiOSTests;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import iOS.utilities.*;
import iOS.pageobjects.*;

public class Scenes extends Main
{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	DevicesPage dp=new DevicesPage(driver);
	AutomationsPage ap = new AutomationsPage(driver);
	ScenesPage sp=new ScenesPage(driver);
	public Scenes() throws MalformedURLException, InterruptedException
	{
		super();
	}
	
	//Create Scenes
	@Test
	public void createScenes() 
	{
		dp.clickondevices();
		dp.clickonmoreoptions();
		sp.clickonaddscene();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(sp.Addactions));
		sp.clickonAddactions();
		ap.clickonSYLVANIASmartA19RGBW();
		ap.clickonOff();
		ap.clickonDone();
		sp.entertexttoscenename();
		ap.clickonSave();
		boolean actual=sp.verifytest();
		Assert.assertSame(false, actual);
	}
	
	//Delete Scenes
	@Test
	public void deleteScenes()
	{
		dp.clickondevices();
		dp.clickonmoreoptions();
		dp.clickonedit();
		sp.clickontest();
		sp.clickondeletescene();
		sp.clickonDELETE();
		dp.clickonback();
		boolean actual=sp.verifytest();
		Assert.assertSame(true, actual);
	}
}