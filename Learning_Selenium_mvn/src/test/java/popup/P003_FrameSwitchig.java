package popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class P003_FrameSwitchig {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/frames");
		
		
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
		
		WebElement f = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(f);
		
		
		String mytext =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(mytext);
		
		
	}
}
