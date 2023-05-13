package dependency;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DependencyTest {
	
	
	
	@Test(priority = 1)
	public void login()
	{
		fail();
		System.out.println("Running login test");
	}
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void home()
	{
		System.out.println("Running home test");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void exp()
	{
		int i=0;
		int j = 10/i;
	}
	
	
	
}
