package iOS.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.MobileElement;

public class ScenesPage 
{
	WebDriver driver;
	By Addscene=By.name("Add scene");
	public By Addactions=By.name("Add actions");
	By Scenename=By.name("Scene name");
	By Deletescene=By.name("Delete scene");
  	By DELETE =By.name("DELETE");
  	By Test=By.name("T");
	
	public ScenesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonaddscene()
	{
		 driver.findElement(Addscene).click();
	}
	public void clickonAddactions()
  	{
  		driver.findElement(Addactions).click();
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
	public boolean verifytest()
	{
		boolean actual=driver.findElements(By.name("T")).isEmpty();
		return(actual);
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
}
