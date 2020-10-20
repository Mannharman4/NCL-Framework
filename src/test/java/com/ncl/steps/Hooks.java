package com.ncl.steps;


import com.ncl.testbase.PageInitiliazer;
import com.ncl.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonMethods {

	@Before
	public void  start(Scenario scenario) {
		System.out.println("Starting sceanrio" +scenario.getName());
		setUp();
		
		PageInitiliazer.initialzePage();
		
	}
	
	@After
	public void end(Scenario scenario) {
		System.out.println("Ending scenrio "+scenario.getName());
		if(scenario.isFailed()) {
			byte[] picture=takeScreenshot("/failed/"+scenario.getName());
			scenario.embed(picture, "image.png");
			
		}
		tearDown();
		
	}
}
