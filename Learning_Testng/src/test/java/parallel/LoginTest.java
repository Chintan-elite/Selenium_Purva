package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	
	
		WebDriver driver;
		@Parameters("browser")
		@Test
		public void test(String browser)
		{
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equals("edge"))
			{
				driver = new EdgeDriver();
				System.setProperty("webdriver.edge.driver", "D:\\Software\\Selenium_data\\msedgedriver.exe");
			}
			driver.get("https://www.fb.com");
			
		}
}
