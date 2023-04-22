package keboar_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class E001_Mouseevent {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(frame);
		
		
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		Actions builder = new Actions(driver);
		
		//m1
		builder.dragAndDrop(img1, trash).build().perform();
		
		
		//m2
		builder.clickAndHold(img2)
				.moveToElement(trash)
				.release()
				.build()
				.perform();
			
		
		
		
	}
}
