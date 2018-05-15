package iOS.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationsPage 
{
	WebDriver driver;
	public final By Automations=By.name("Automations");
	By Addautomation=By.name("Add automation");
	public By Customautomation=By.name("Custom automation");
	By Whendoyouwanttousethisautomation=By.name("When do you want to use this automation?");
	By Basedonthislocationsmode=By.name("Based on this location's mode");
	By Night=By.name("Night");
	By Done=By.name("Done");
	By Whatdoyouwantthisautomationtodo=By.name("What do you want this automation to do?");
	By SYLVANIASmartA19RGBW=By.name("SYLVANIA Smart A19 RGBW");
	By Off=By.name("Off");
	public By Save=By.name("Save");
	public By LocationmodeNightAutomationtoggleenabled=By.name("Location mode, Night - Automation toggle enabled.");
	public By Moreoptions=By.name("More options");
	By Delete=By.name("Delete");
	public By LocationmodeNightDelete=By.name("Location mode, Night Delete");
	public By LocationmodeNight=By.name("Location mode, Night");
	//char element;
	String element;
	
	public AutomationsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonAutomations()
	{
		driver.findElement(Automations).click();
	}
	public void clickonMoreoptions()
	{
		driver.findElement(Moreoptions).click();
	}
	public void clickonDelete()
	{
		driver.findElement(Delete).click();
	}
	public void clickonLocationModeNightDelete()
	{
		driver.findElement(LocationmodeNightDelete).click();
	}
	
	
	public void clickonAddautomations()
	{
		driver.findElement(Addautomation).click();
	}
	public void clickonCustomautomations()
	{
		driver.findElement(Customautomation).click();
	}
	public void clickonWhendoyouwanttousethisautomation()
	{
		driver.findElement(Whendoyouwanttousethisautomation).click();
	}
	public void clickonBasedonthislocationsmode()
	{
		driver.findElement(Basedonthislocationsmode).click();
	}
	public void clickonNight()
	{
		driver.findElement(Night).click();
	}
	public void clickonDone()
	{
		driver.findElement(Done).click();
	}
	public void clickonWhatdoyouwantthisautomationtodo()
	{
		driver.findElement(Whatdoyouwantthisautomationtodo).click();
	}
	public void clickonSYLVANIASmartA19RGBW()
	{
		driver.findElement(SYLVANIASmartA19RGBW).click();
	}
	public void clickonOff()
	{
		driver.findElement(Off).click();
	}
	public void clickonSave()
	{
		driver.findElement(Save).click();
	}
	public boolean verifyLocationmodenightautomationtoggleenabled()
	{
		boolean actual=driver.findElement(LocationmodeNightAutomationtoggleenabled).isDisplayed();
		return(actual);
	}
	public boolean verifyAutomations()
	{
		boolean actual=driver.findElement(Automations).isDisplayed();
		return(actual);
	}
	public boolean verifyOff()
	{
		boolean actual=driver.findElement(Off).isDisplayed();
		return(actual);
	}
	
	
}
