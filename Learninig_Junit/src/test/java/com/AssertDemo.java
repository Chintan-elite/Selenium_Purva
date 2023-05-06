package com;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertDemo {
	
		@Test
		public void test()
		{
			int a = 10;
			int b = 20;
			int c = 10;
			String d = null;
			
			//assertEquals(a, c);
			//assertEquals(a, b);
			//assertTrue(a>b);
			//assertTrue(a<b);
			//assertFalse(a==b);
			//assertNull(d);
			
			int k[] = {10,20,30,40,50,60};
			int l[] = {10,20,30,50,50,60};
			
			assertArrayEquals(k, l);
			
		}
	
}
