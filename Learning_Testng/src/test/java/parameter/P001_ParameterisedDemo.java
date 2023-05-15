package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class P001_ParameterisedDemo {

	@Parameters({"username","password"})
	@Test
	public void login(String uname, String pass)
	{
		WebDriver driver = DriverConnection.connect("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		
	}
}
