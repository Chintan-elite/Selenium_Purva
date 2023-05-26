package basic;

import static org.testng.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Account {
	
	Logger log = LogManager.getLogger(Account.class);
	@Test
	public void savingAccount()
	{
	//	fail("test failed");
		log.info("Running saving account");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void loanAccount()
	{
		log.info("Running loan account");
	}
	
	@Test(groups = "smoke")
	public void currentAccount()
	{
		log.info("Running current account");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		log.info("Running before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		log.info("Runing after method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		log.info("Running before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		log.info("Runnig after class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		log.info("Runing before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		log.info("Running after Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		log.info("Running before suit");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		log.info("Runing after suite");
	}
}
