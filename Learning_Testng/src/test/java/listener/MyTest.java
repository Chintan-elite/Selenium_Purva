package listener;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class MyTest {
		
		@Test
		public void test1()
		{
			System.out.println("Running test1");
		}
		
		@Test
		public void test2()
		{
			System.out.println("Running test2");
			fail();
		}
		
		@Test
		public void test3()
		{
			System.out.println("Runing test 3");
		}
		
		
}
