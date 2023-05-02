package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewTest {

	@Test
	public void test1() {
		
		System.out.println("Runinng test1");
		fail("Test faild");
	}
	
	@Test
	public void test2() {
		
		System.out.println("Runinng test2");
	}
	
	
	@Test
	public void test3() {
		
		System.out.println("Runinng test3");
	}

}
