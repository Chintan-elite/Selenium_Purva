package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest {
	
	
	public static final Logger log = LogManager.getLogger(MyTest.class);
	public static void main(String[] args) {
		
		
		log.info("this is info message");
		log.debug("this is debug message");
		log.error("this is error message");
		log.fatal("this is fatal message");
		
		
		
	}
}
