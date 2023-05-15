package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class P001_ParameterisedDemo_multi {

	WebDriver driver ;
	@BeforeClass
	public void setUp()
	{
		 driver = DriverConnection.connect("https://facebook.com");
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass)
	{
		driver.findElement(By.id("email")).clear();;
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();	
		
		driver.navigate().back();
	}
	
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech123";
		
		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc123";
		
		return obj;
	}
	
	
	
}
