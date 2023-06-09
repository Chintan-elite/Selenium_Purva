package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class keyword {

	WebDriver driver ;
	
	
	@Test(dataProvider = "dp")
	public void test(String function, String keyword, String locator, String location, String data)
	{
		if(keyword.equals("browser"))
		{
			if(data.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(data.equals("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Software\\Selenium_data\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(data.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "D:\\selenuum data\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		}
		else if(keyword.equals("url"))
		{
			driver.get(data);
		}
		else if(keyword.equals("type"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
		}
		else if(keyword.equals("click"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		}
		else if(keyword.equals("select"))
		{
			if(locator.equals("id"))
			{
				Select elements = new Select(driver.findElement(By.id(location)));
				elements.selectByVisibleText(data);
			}
			else if(locator.equals("name"))
			{
				Select elements = new Select(driver.findElement(By.name(location)));
				elements.selectByVisibleText(data);
			}
			else if(locator.equals("xpath"))
			{
				Select elements = new Select(driver.findElement(By.xpath(location)));
				elements.selectByVisibleText(data);
			}
		}
		else if(keyword.equals("close"))
		{
			driver.close();
		}
	}
	
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{	
		ExcellReader rd = new ExcellReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\mytest.xlsx","fb");
		int rows = rd.rowCount();
		int cols = rd.colCount();
		
		
		Object[][] obj = new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		return obj;
	}
	
	
	
}
