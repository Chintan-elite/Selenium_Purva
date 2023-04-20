package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P002_Multiplewindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
		
		String mainWindow =  driver.getWindowHandle();
		System.out.println("Main : "+mainWindow);
		
		driver.findElement(By.id("tabButton")).click();
		
		
		 Set<String> allWindows =  driver.getWindowHandles();
		 for(String s : allWindows)
		 {
			if(!s.equals(mainWindow))
			{
				driver.switchTo().window(s);
			}
		 }
		
		
		
		String mytext = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(mytext);
		
		
		
		
	}
}
