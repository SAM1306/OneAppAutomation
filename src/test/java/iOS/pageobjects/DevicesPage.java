package iOS.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DevicesPage 
{
	WebDriver driver;
	By Devices=By.name("Devices");
	By Moreoptions=By.name("More options");
	By Edit=By.name("Edit");
	By Back=By.name("Back");
  	
	public DevicesPage(WebDriver driver)
	{
		 this.driver=driver;
	}
  	public boolean verifydevices()
	{
		 boolean actual=driver.findElement(Devices).isDisplayed();
		 return(actual);
	}
	public void clickondevices()
	{
		driver.findElement(Devices).click();
	}
	public void clickonmoreoptions()
	{
		driver.findElement(Moreoptions).click();
	}
	public void clickonedit()
	{
		driver.findElement(Edit).click();
	}
	public void clickonback()
	{
		driver.findElement(Back).click();
	}
}
