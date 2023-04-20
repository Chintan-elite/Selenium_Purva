package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverConnection;

public class B011_Wait {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.id("alertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("alertButton"))));
		
		driver.findElement(By.id("alertButton")).click();
		
	}
}
