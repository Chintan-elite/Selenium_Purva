package basic;

import org.testng.annotations.Test;

public class NewTest {
	
	@Test(priority = 4)
	public void test1()
	{
		System.out.println("Running test 1");	
	}
	
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("Running test 2");
	}
	
	@Test(priority = 2, enabled = false)
	public void alpha()
	{
		System.out.println("Running alpha test");
	}
	
	@Test(priority = 3)
	public void beta()
	{	
		System.out.println("Runnig beta test");
	}
}
