package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B005_Linktext_partiallink {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement c =  driver.findElement(By.linkText("Create"));
		
		List<WebElement> links =  driver.findElements(By.partialLinkText("Meta"));
		System.out.println(links.size());
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		
		//driver.close();
		driver.quit();
		
		
		
		
	}
}
