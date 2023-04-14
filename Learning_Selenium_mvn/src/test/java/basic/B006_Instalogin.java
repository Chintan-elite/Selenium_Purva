package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B006_Instalogin {
	
		public static void main(String[] args) {
			

			System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9858748592");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tech123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
			
		}
	
}
