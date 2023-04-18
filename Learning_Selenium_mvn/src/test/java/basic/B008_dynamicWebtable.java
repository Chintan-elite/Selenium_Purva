package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B008_dynamicWebtable {
	public static void main(String[] args) {
		

		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
//		List<WebElement> hdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
//		
//		for(WebElement dt : hdata)
//		{
//			System.out.println(dt.getText());
//		}
//		
//		
//		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//		
//		for(WebElement dt : data)
//		{
//			System.out.println(dt.getText());
//		}
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> hcols =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement col : hcols)
		{
			System.out.print(col.getText()+"   ");
		}
		System.out.println();
		for(int i=2;i<=rows.size();i++)
		{
			
			
			
			List<WebElement> cols =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(WebElement col : cols)
			{
				System.out.print(col.getText()+"   ");
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		driver.quit();
	}
}
