package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import screenshot.S001_ScreenshotDemo;
import util.DriverConnection;

public class C001_Datepicker {
		
		public static void main(String[] args) {
			
			WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			WebElement frame = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
			driver.switchTo().frame(frame);
			driver.findElement(By.id("datepicker")).click();
			
			String myDate = "21";
			String myMonth="March";
			String myYear = "2019";
			
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
			int a = Integer.parseInt(currentYear);
			int b = Integer.parseInt(myYear);
			
			
			//year selection
			while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
			{
				if(b>a)
				{
					driver.findElement(By.xpath("//*[@data-handler='next']")).click();
				
				
				
				}
				else
				{
					driver.findElement(By.xpath("//*[@data-handler='prev']")).click();
					
				}
			
			}
			
			
			//month selection
			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
			{
				if(b>a)
				{
					driver.findElement(By.xpath("//*[@data-handler='next']")).click();
				}
				else
				{
					driver.findElement(By.xpath("//*[@data-handler='prev']")).click();	
				}
			}
			
			
			
			
			
			//date selction
			List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
			for(WebElement date : dates)
			{
				String data = date.getText();
				if(data.equals(myDate))
				{
					date.click();
				}
			}
			
			
			S001_ScreenshotDemo.getScreenShot(driver, "D://test//datapicket.png");
			
			
			
			
			
			
			
			
			
			
		}
}
