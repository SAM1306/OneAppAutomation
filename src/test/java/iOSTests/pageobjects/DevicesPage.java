package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.MobileElement;

public class DevicesPage 
{
	WebDriver driver;
	By Devices=By.name("Devices");
	By Moreoptions=By.name("More options");
	By Edit=By.name("Edit");
	By Test=By.name("T");
	By Deletescene=By.name("Delete scene");
  	By DELETE =By.name("DELETE");
  	By Back=By.name("Back");
  	By Addscene=By.name("Add scene");
  	By Scenename=By.name("Scene name");
  	By Addactions=By.name("Add actions");
	
  	public DevicesPage(WebDriver driver)
	{
		 this.driver=driver;
	}
  	public void entertexttoscenename()
	{
		MobileElement element = (MobileElement) driver.findElement(Scenename);
		element.click();
		driver.findElement(By.name("T")).click();
		//driver.findElement(By.name("e")).click();
		//driver.findElement(By.name("s")).click();
		//driver.findElement(By.name("t")).click();
	}
	public boolean verifydevices()
	{
		 boolean actual=driver.findElement(Devices).isDisplayed();
		 return(actual);
	}
	public void clickonaddscene()
	{
		 driver.findElement(Addscene).click();
	}
	public void clickondevices()
	{
		driver.findElement(Devices).click();
	}
	public void clickonAddactions()
  	{
  		driver.findElement(Addactions).click();
  	}
	public void clickonmoreoptions()
	{
		driver.findElement(Moreoptions).click();
	}
	public void clickonedit()
	{
		driver.findElement(Edit).click();
	}
	public void clickontest()
	{
		driver.findElement(Test).click();
	}
	public void clickondeletescene()
	{
		driver.findElement(Deletescene).click();
	}
	public void clickonDELETE()
	{
		driver.findElement(DELETE).click();
	}
	public void clickonback()
	{
		driver.findElement(Back).click();
	}
	public boolean verifytest()
	{
		boolean actual=driver.findElements(By.name("T")).isEmpty();
		return(actual);
	}
}
