package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ForgotPassPage;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginTest {
		
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys("test@gmail.com");
		loginPage.getPass().sendKeys("test");
		loginPage.getLogin().click();
	}
	
	@Test
	public void regTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getNewAccount().click();
		
		RegistrationPage reg = new RegistrationPage(driver);
		reg.getFname().sendKeys("test");
		reg.getLname().sendKeys("tech");
		reg.getPhon().sendKeys("9585968744");	
	}
	
	@Test
	public void forgetPass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getForgotPass().click();
		
		ForgotPassPage forgot = new ForgotPassPage(driver);
		forgot.getEmail().sendKeys("test@gmail.com");
		forgot.getSearch().click();
		
	}
}
