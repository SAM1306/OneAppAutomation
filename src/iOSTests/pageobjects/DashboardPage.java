package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{
	WebDriver driver;
	By Dashboard=By.name("Dashboard");
    By Managedashboard=By.name("Manage dashboard");
    By Showallcards=By.name("Show all cards");
    
    public DashboardPage(WebDriver driver)
	{
    		this.driver=driver;
	}
    public boolean verifydashboard()
	{
    		boolean actual=driver.findElement(Dashboard).isDisplayed();
    		return(actual);
	}
    public void clickondashboard()
    {
    		driver.findElement(Dashboard).click();
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
