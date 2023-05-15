package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FbTest {
		
		@Test(priority = 1)
		public void titleCheck(ITestContext i)
		{
			WebDriver driver = DriverConnection.connect("https://facebook.com");
			i.setAttribute("driver", driver);
			assertEquals(driver.getTitle(), "FB");
		}
		
		@Test(priority = 2)
		public void logincheck(ITestContext i)
		{
			WebDriver driver = DriverConnection.connect("https://facebook.com");
			driver.findElement(By.id("email")).sendKeys("test");
			driver.findElement(By.id("pass")).sendKeys("test");
			driver.findElement(By.name("login")).click();
			i.setAttribute("driver", driver);
			assertEquals(driver.getTitle(), "fb");
			
		}
}
