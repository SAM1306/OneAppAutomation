package iOS.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage 
{
	WebDriver driver;
	By Settings=By.name("Settings");
	
	public SettingsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonsettings()
    {
    		driver.findElement(Settings).click();
    }
}
