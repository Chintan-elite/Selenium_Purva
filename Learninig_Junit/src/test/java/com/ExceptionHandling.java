package com;

import org.junit.Test;

public class ExceptionHandling {
	
		@Test(expected = ArithmeticException.class)
		public void test()
		{
			int a = 10;
			int b = a/0;
		}
		
		
		
}
