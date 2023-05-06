package com;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

@RunWith(Parameterized.class)
public class PArametrisedTest_Login {

	String uname;
	String pass;
	
	public PArametrisedTest_Login(String uname, String pass) {
		
		this.uname = uname;
		this.pass = pass;
	}
	static WebDriver driver;
	@BeforeClass
	public static void setup()
	{
		 driver = DriverConnection.connect("https://www.facebook.com/");
	}

	@Test
	public void logintest()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement a =  driver.findElement(By.id("email"));
		a.clear();
		a.sendKeys(uname);
		
		WebElement b = driver.findElement(By.id("pass"));
		b.clear();
		b.sendKeys(pass);	
		
		driver.findElement(By.name("login")).click();
		
		
		driver.navigate().back();
		
		
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object[][] obj = new Object[4][2];
		
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech123";
		
		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc123";
		
		obj[3][0] = "xyz@gmail.com";
		obj[3][1] = "xyz123";
		
		return Arrays.asList(obj);
		
	}
}
