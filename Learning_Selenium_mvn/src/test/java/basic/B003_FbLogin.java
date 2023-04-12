package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B003_FbLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.clear();
		email.sendKeys("test@gmail.com");
		
		pass.clear();
		pass.sendKeys("qwerty@233");
		
		login.click();
		
		
		
	}
}
