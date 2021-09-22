package com.cjc;

import org.apache.log4j.Logger;



public class NewDemo {

	static Logger log=Logger.getLogger(NewDemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		
		System.out.println("hello");
	}

}
