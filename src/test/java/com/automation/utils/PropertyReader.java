package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	public static void initProperty() throws Exception {
		FileReader reader = new FileReader(
				"/Users/alicetin/Desktop/eclipse/CucumberAutomation/src/test/resources/config/config.properties");
		prop.load(reader);

	}

	public static String getProperty(String key) {

		return prop.getProperty(key);

	}

}
