package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import util.DriverConnection;

public class B007_StaticWebTable {
	public static void main(String[] args) {
		
		WebDriver driver =  DriverConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String data =   driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]")).getText();
		
		System.out.println(data);
		
		driver.quit();
		
	}
}
