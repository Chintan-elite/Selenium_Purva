package basic;

import org.testng.annotations.Test;

public class Payment {
	
	@Test
	public void creditCard()
	{
		System.out.println("running creditcard payment");
	}
	
	@Test
	public void debitCard()
	{
		System.out.println("runing debitcard payment");
	}
	
	@Test
	public void cod()
	{
		System.out.println("running cod payment");
	}
}
