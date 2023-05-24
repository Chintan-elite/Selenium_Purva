package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class datadriven {

	WebDriver driver ;
	@BeforeClass
	public void setUp()
	{
		 driver = DriverConnection.connect("https://facebook.com");
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass)
	{
		driver.findElement(By.id("email")).clear();;
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();	
		
		driver.navigate().back();
	}
	
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{	
		ExcellReader rd = new ExcellReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\mytest.xlsx","login");
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
