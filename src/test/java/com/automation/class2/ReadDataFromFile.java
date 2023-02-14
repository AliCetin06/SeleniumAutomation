package com.automation.class2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.automation.utils.PropertyReader;

public class ReadDataFromFile {

	public static void main(String[] args) throws Exception {
		
		// read data from any file and get the values
		
		FileReader reader = new FileReader("/Users/alicetin/Desktop/eclipse/TestNGAutomation/src/test/resources/config/config.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		// puting the key and getting the values
		System.out.println(prop.getProperty("login.username"));
		System.out.println(prop.getProperty("login.password"));
		
		
		// reading data by propertyReader utils
		
		PropertyReader.initProperty();
		System.out.println(PropertyReader.getProperty("login.username"));
		System.out.println(PropertyReader.getProperty("login.password"));

	}

}
