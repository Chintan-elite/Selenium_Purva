package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class PracticeForm {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9055857485");
		driver.findElement(By.id("dateOfBirthInput")).click();
		String myDate = "20";
		String myMonth = "December";
		String myYear = "2009";
		
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement day : days)
		{
			String data  = day.getText();
			if(data.equals(myDate))
			{
				if(day.getAttribute("aria-label").contains(myMonth))
				{
					day.click();
					break;
				}
			
				
			}
		}
		
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions action = new Actions(driver);
		action.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
		
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\CHINTAN\\Downloads\\download.png");
		
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat");
		
		
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
		
	}
	
}
