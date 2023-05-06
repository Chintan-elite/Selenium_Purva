package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationDemo {
	
		@Test
		public void alpha()
		{
			System.out.println("Running alpha test");
		}
		
		//@Ignore
		@Test
		public void beta()
		{
			System.out.println("Running beta test");
		}
		
		@Test
		public void gama()
		{
			System.out.println("Running gama test");
		}
		
		@Before
		public void beforeTest()
		{
			System.out.println("This method will run before every test");
		}
		
		@After
		public void afterTest()
		{
			System.out.println("This method will Run after every test");
		}
		
		@BeforeClass
		public static void beforeClass()
		{
			System.out.println("before class");
		}
		
		@AfterClass
		public static void afterClass()
		{
			System.out.println("after class");
		}
		
		
		

}
