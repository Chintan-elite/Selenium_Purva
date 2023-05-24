package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassPage {
		
	WebDriver driver;
	
	public ForgotPassPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "identify_email")
	WebElement email;
	
	@FindBy(id="did_submit")
	WebElement search;
	
	@FindBy(linkText = "Cancel")
	WebElement cancel;
	
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getSearch()
	{
		return search;
	}
	
	public WebElement getCancel()
	{
		return cancel;
	}
}
