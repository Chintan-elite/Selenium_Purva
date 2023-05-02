package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import util.DriverConnection;

public class S001_ScreenshotDemo {
	
	
		public static void getScreenShot(WebDriver driver, String path)
		{
			TakesScreenshot ss = (TakesScreenshot) driver;
			File source = ss.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			
			try {
				Files.copy(source, dest);
				System.out.println("Screenshot taken");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		public static void main(String[] args) {
			
			
			
			
			WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
			
			
			getScreenShot(driver, "D://test//home.png");
			
			
			driver.findElement(By.id("email")).sendKeys("test@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("test45f");
			driver.findElement(By.name("login")).click();
			
			getScreenShot(driver, "D://test//error.png");
			
		}
	
}
