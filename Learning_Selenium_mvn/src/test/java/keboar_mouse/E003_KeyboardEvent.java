package keboar_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class E003_KeyboardEvent {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.google.com/");
		
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		
		builder.click(search)
				.keyDown(Keys.SHIFT)
				.sendKeys("Rose")
				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		
		
	}
}
