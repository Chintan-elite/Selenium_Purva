package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class ScrollDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("Meta Store"));
		
		//js.executeScript("window.scrollBy(0,100)");
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
