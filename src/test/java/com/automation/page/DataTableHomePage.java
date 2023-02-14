package com.automation.page;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTableHomePage extends BasePage {
	
	@FindBy (id ="example_wrapper")
	WebElement verifyData;

	public DataTableHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verifyTitleOfPage() {
		// TODO Auto-generated method stub
		
	}

	public void openDataTableWebsite() {
		driver.get("https://datatables.net/");
		
	}



	public void verifyOfDataHomePage() {
		commonmethods.waitForElementToBeVisiable(verifyData);
		Assert.assertTrue("Data of table is not displayed", verifyData.isDisplayed());
		
		
	}

	public void verifyDataTableData(List<List<String>> listOfItems) {
		
		// total row
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		
		// all  elements which is removed hidden element
		String tableDataInRow = "//table[@id='example']/tbody/tr[%s]/td[not(contains(@style ,'none'))]";

		for(int i=0 ; i< listOfItems.size(); i++ ) {  // checking row size
			
			List<WebElement> updatedList = driver.findElements(By.xpath(String.format(tableDataInRow, i+1)));
			
			for (int j=0; j< listOfItems.get(i).size(); j++) {  //cheking column size
				String expectedItems = listOfItems.get(i).get(j); // get all data from .feauture file  ( feature ,excel , database )
				String actualItems = updatedList.get(j).getText(); // get all data from website
				Assert.assertTrue("Expected: "+ expectedItems +" Actual: "+ expectedItems, actualItems.equals(expectedItems));
			}
			System.out.println();
		}
		
	}

	public void verifyDataTableDataWithHeader(List<Map<String, String>> listOfMap) {
		
		String tableDataInRow = "//table[@id='example']/tbody/tr[%s]/td[not(contains(@style ,'none'))]";
		for (int i = 0; i < listOfMap.size(); i++) {
			
			List<WebElement> updatedList = driver.findElements(By.xpath(String.format(tableDataInRow, i+1)));

	String map1 = listOfMap.get(i).get("Name");
	Assert.assertTrue("name is not same", map1.equals(map1));
	//		listOfMap.get(i).get("Position");
	//		listOfMap.get(i).get("Office");
	//		listOfMap.get(i).get("Age");
	//		listOfMap.get(i).get("Start date");
			
			}
			
		}	
	}
	
	
	
	
	
	
	


