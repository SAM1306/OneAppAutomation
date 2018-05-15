package iOS.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage 
{
	WebDriver driver;
	By Smarthomemonitor=By.name("Smart Home Monitor");
	By Smartthings=By.name("SmartThings");
	By Monitoryourhomeforintrusions=By.name("Monitor your home for intrusions.");
	public By Next=By.name("NEXT");
	public By DONE=By.name("DONE");
	public By Allow=By.name("ALLOW");
	public By Smarthomemonitordisplay=By.name("Smart Home Monitor - Automation toggle enabled.");
	
	public CatalogPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonallow()
	{
		driver.findElement(Allow).click();
	}
	public void clickonext()
	{
		driver.findElement(Next).click();
	}
	public void clickonDONE()
	{
		driver.findElement(DONE).click();
	}
	public void clickonsmarthomemonitor()
	{
		driver.findElement(Smarthomemonitor).click();
	}
	public boolean verifysmarthomemonitor()
	{
		boolean actual=driver.findElement(Smarthomemonitor).isDisplayed();
		return(actual);
	}
	public boolean verifysmartthings()
	{
		boolean actual=driver.findElement(Smartthings).isDisplayed();
		return(actual);
	}
	public boolean verifymonitoryourhomeforintrusions()
	{
		boolean actual=driver.findElement(Monitoryourhomeforintrusions).isDisplayed();
		return(actual);
	}
	public boolean verifysmarthomemonitordisplay()
	{
		boolean actual=driver.findElement(Smarthomemonitordisplay).isDisplayed();
		return(actual);
	}
}
