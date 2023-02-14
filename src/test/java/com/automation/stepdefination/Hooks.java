package com.automation.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() throws Exception {
		PropertyReader.initProperty();

		DriverUtils.createDriver();

	}
	
	// conditional hooks
	
	@Before("@ie")  // use this method before whenever you see @test , so basicly prepare to test data for test
	public void setUpTestData() {
		
	}

	@After
	public void cleanUp() {
		DriverUtils.getDriver().quit();
	}

}
