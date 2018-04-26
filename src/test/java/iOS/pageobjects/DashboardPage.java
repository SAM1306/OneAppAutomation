package iOS.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{
	WebDriver driver;
	By Dashboard=By.name("Dashboard");
    By Managedashboard=By.name("Manage dashboard");
    By Showallcards=By.name("Show all cards");
    By Settings=By.name("Settings");
    By Uselocationinformation=By.name("Use location information");
    By Autoupdatedevicecontroller=By.name("Auto update device controller");
    By Wifionly=By.name("Wi-Fi only");
    By Wifiormobie=By.name("Wi-Fi or mobile data Data charges may apply.");
    By Adddevice=By.name("Add device");
    By Hubs=By.name("Hubs");
    By Moisturesensor=By.name("Moisture sensor");
    By Motionsensor=By.name("Motion sensor");
    By Multifunctionalsensor=By.name("Multi-functional sensor");
    
    public DashboardPage(WebDriver driver)
	{
    		this.driver=driver;
	}
    public boolean verifydashboard()
	{
    		boolean actual=driver.findElement(Dashboard).isDisplayed();
    		return(actual);
	}
    
    public boolean verifyhubs()
	{
    		boolean actual=driver.findElement(Hubs).isDisplayed();
    		return(actual);
	}
    public boolean verifymoisturesensor()
   	{
       		boolean actual=driver.findElement(Moisturesensor).isDisplayed();
       		return(actual);
   	}
    public boolean verifymotionsensor()
   	{
       		boolean actual=driver.findElement(Motionsensor).isDisplayed();
       		return(actual);
   	}
    public boolean verifymultifunctionalsensor()
   	{
       		boolean actual=driver.findElement(Multifunctionalsensor).isDisplayed();
       		return(actual);
   	}
    
    
    public boolean verifywifionly()
   	{
       boolean actual=driver.findElement(Wifionly).isDisplayed();
       return(actual);
   	}
    public boolean verifywifiormobile()
   	{
       boolean actual=driver.findElement(Wifiormobie).isDisplayed();
       return(actual);
   	}
    public boolean verifyuselocationinfromation()
    {
    		boolean actual=driver.findElement(Uselocationinformation).isDisplayed();
		return(actual);
    }
    public void clickonautoupdatedevicecontroller()
    {
    		driver.findElement(Autoupdatedevicecontroller).click();
    }
    public void clickonsettings()
    {
    		driver.findElement(Settings).click();
    }
    public void clickondashboard()
    {
    		driver.findElement(Dashboard).click();
    }
    
    public void clickonadddevice()
    {
    		driver.findElement(Adddevice).click();
    }
    public void clickonmanagedashboard()
    {
    	driver.findElement(Managedashboard).click();
    }
    public void clickonshowallcards()
    {
    	driver.findElement(Showallcards).click();
    }
    public void checkshowallcardtogglestatus()
	{
		String actual= 	driver.findElement(Showallcards).getAttribute("type");
		System.out.println(actual);
	}
}
