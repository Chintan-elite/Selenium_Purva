package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_FirstTest {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expected = "Facebook – log in or sign up";
		String actual = driver.getTitle();
		//System.out.println(actual);
		
		if(expected.equals(actual))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Faild");
		}
		
	}
}
