package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
		
	
		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		
		By email = By.id("email");
		By pass = By.id("pass");
		By login = By.name("login");
		By forgotpass = By.linkText("Forgotten password?");
		By newaccount = By.linkText("Create new account");
		
		public WebElement getEmail()
		{
			return driver.findElement(email);
		}
		
		public WebElement getPass()
		{
			return driver.findElement(pass);
		}
		
		public WebElement getLogin()
		{
			return driver.findElement(login);
		}
		
		public WebElement getForgotPass()
		{
			return driver.findElement(forgotpass);
					
		}
		
		public WebElement getNewAccount()
		{
			return driver.findElement(newaccount);
		}
	
}		
