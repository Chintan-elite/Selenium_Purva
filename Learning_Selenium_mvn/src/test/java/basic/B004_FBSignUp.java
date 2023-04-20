package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B004_FBSignUp {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.findElement(By.linkText("Create new account")).click();
		
//		 try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		 
		 
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("reg_email__")).sendKeys("9856748596");
		driver.findElement(By.id("password_step_input")).sendKeys("tech123");
		
		
		//driver.findElement(By.id("day")).sendKeys("40");
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("15");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByIndex(2);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByValue("2020");
		 
		 
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
		gender.get(1).click();
		
		
		
		 
		
		
	}
}
