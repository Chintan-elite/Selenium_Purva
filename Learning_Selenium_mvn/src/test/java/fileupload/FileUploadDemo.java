package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class FileUploadDemo {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/upload/");
		
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\CHINTAN\\Downloads\\Marksheet.pdf");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.name("send")).click();
		
		
		
		
	}
}
