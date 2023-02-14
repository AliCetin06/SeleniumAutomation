package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features ="/Users/alicetin/Desktop/eclipse/CucumberAutomation/src/test/resources/features/DataTable.feature" ,
			glue = "com.automation.stepdefination" ,
			dryRun = false ,	// when it is true --->just check step definitions  , just gives sugesstion not open any browser
			tags =  " @2ndDatatable", //we can use and or not
			plugin = {"html:report/index.html" , "json:report/cucumber.json" }
		)
public class TestRunner {
	
	

}
