package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B009_XpathDemo {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/webtables");
		
		String myname = "Cierra";
		
		try {
			WebElement name = driver.findElement(By.xpath("//*[text()='"+myname+"']"));
			
			if(name.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+myname+"']/following-sibling::div[6]/div/span[1]")).click();
			}
			
		} catch (Exception e) {
			System.out.println("Element not found");
		}
		
		
		
	}
	
	
}
