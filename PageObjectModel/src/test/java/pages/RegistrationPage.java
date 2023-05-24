package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
		
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By firstName = By.name("firstname");
	By lastName = By.name("lastname");
	By phno = By.name("reg_email__");
	
	
	public WebElement getFname()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement getLname()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement getPhon()
	{
		return driver.findElement(phno);
	}
	
	
}
