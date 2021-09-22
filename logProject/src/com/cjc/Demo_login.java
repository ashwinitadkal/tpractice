package com.cjc;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_login {
	static Logger log=Logger.getLogger(Demo_login.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_cjc\\chrome_driver_exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		log.info("test start");
		//log.error("error");
		
		//System.out.println("test1 started");
		driver.findElement(By.name("userName")).sendKeys("AAAAA");
		driver.findElement(By.name("password")).sendKeys("aaaaa");
		driver.findElement(By.name("submit")).click();
		//System.out.println("test1 finish");
		log.info("test end");
	}

}
