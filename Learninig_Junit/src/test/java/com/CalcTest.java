package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actualResult =  c.add(10, 20);
		int expectedResult = 30;
		
//		if(actualResult==expectedResult)
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void squareTest()
	{
		Calc c = new Calc();
		int actual = c.square(10);
		int expected = 100;
		
		assertEquals(expected, actual);	
	}
	
}
