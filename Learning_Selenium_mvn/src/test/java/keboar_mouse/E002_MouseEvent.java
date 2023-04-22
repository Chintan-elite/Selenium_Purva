package keboar_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class E002_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.in/");
		
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		WebElement ele = driver.findElement(By.linkText("Electronics"));
		
		Actions builder = new Actions(driver);
		
		
		builder.moveToElement(sell).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(mobile).build().perform();
		Thread.sleep(2000);
		Action myevent =  builder.moveToElement(ele).build();
		
		
		myevent.perform();
		
		
		
		
		
		
		
	}
}
