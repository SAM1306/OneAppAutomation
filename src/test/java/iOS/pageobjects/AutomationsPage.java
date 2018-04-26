package iOS.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationsPage 
{
	WebDriver driver;
	By Automations=By.name("Automations");
	By Addautomation=By.name("Add automation");
	By Customautomation=By.name("Custom automation");
	By Whendoyouwanttousethisautomation=By.name("When do you want to use this automation?");
	By Basedonthislocationsmode=By.name("Based on this location's mode");
	By Night=By.name("Night");
	By Done=By.name("Done");
	By Whatdoyouwantthisautomationtodo=By.name("What do you want this automation to do?");
	By SYLVANIASmartA19RGBW=By.name("SYLVANIA Smart A19 RGBW");
	By Off=By.name("Off");
	By Save=By.name("Save");
	By LocationmodeNightAutomationtoggleenabled=By.name("Location mode, Night - Automation toggle enabled.");
	By Moreoptions=By.name("More options");
	By Delete=By.name("Delete");
	By LocationmodeNightDelete=By.name("Location mode, Night Delete");
	By LocationmodeNight=By.name("Location mode, Night");
	
	//Start Catalog Objects
	By Smarthomemonitor=By.name("Smart Home Monitor");
	By Smartthings=By.name("SmartThings");
	By Monitoryourhomeforintrusions=By.name("Monitor your home for intrusions.");
	public By Next=By.name("NEXT");
	public By DONE=By.name("DONE");
	public By Allow=By.name("ALLOW");
	public By Smarthomemonitordisplay=By.name("Smart Home Monitor - Automation toggle enabled.");
	
	//End Catalog Objects
	
	
	
	
	public AutomationsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Start Catalog functions
	
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
	//End Catalog functions
	
	
	public void clickonLocationmodeNightDelete()
	{
		driver.findElement(LocationmodeNightDelete).click();
	}
	public void clickondelete()
	{
		driver.findElement(Delete).click();
	}
	public void clickonautomations()
	{
		driver.findElement(Automations).click();
	}
	public void clickonmoreoptions()
	{
		driver.findElement(Moreoptions).click();
	}
	public void clickonaddautomations()
	{
		driver.findElement(Addautomation).click();
	}
	public void clickoncustomautomations()
	{
		driver.findElement(Customautomation).click();
	}
	public void clickonwhendoyouwanttousethisautomation()
	{
		driver.findElement(Whendoyouwanttousethisautomation).click();
	}
	public void clickonbasedonthislocationsmode()
	{
		driver.findElement(Basedonthislocationsmode).click();
	}
	public void clickonnight()
	{
		driver.findElement(Night).click();
	}
	public void clickondone()
	{
		driver.findElement(Done).click();
	}
	public void clickonwhatdoyouwantthisautomationtodo()
	{
		driver.findElement(Whatdoyouwantthisautomationtodo).click();
	}
	public void clickonSYLVANIASmartA19RGBW()
	{
		driver.findElement(SYLVANIASmartA19RGBW).click();
	}
	public void clickonoff()
	{
		driver.findElement(Off).click();
	}
	public void clickonsave()
	{
		driver.findElement(Save).click();
	}
	public boolean verifyLocationmodeNightAutomationtoggleenabled()
	{
		boolean actual=driver.findElement(LocationmodeNightAutomationtoggleenabled).isDisplayed();
		return(actual);
	}
	public boolean verifyautomations()
	{
		boolean actual=driver.findElement(Automations).isDisplayed();
		return(actual);
	}
	public boolean verifyoff()
	{
		boolean actual=driver.findElement(Off).isDisplayed();
		return(actual);
	}
}
