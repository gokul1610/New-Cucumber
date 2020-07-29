package org.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksclass extends BaseClass {
	
	@Before
	public void beforeClass() {
		System.out.println("Before will execute 1st");
		LaunchChromeBrowser();
				
		
	}
	@Before("@Sanity")
	public void beforExceutionOfGroups() {
		System.out.println("Before Sanity");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	@Before("@Regression")
	public void beforeExecution(){
		System.out.println("Before Regression");
		driver.manage().window().maximize();

	}
	
	
	@After
	public void afterClass() {
		System.out.println("After class will run at the end");
		driver.close();
	}

}
