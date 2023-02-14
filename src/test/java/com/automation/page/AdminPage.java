package com.automation.page;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage{
	
	@FindBy (xpath ="//span[@class='oxd-topbar-header-breadcrumb']")
	WebElement titleOfPage;
	
	@FindBy (xpath ="(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
	WebElement jobOption;
	
	@FindBy (xpath ="//ul[@class='oxd-dropdown-menu']/li")
	List <WebElement> listOfJob;
	
	
	

	public AdminPage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public void verifyTitleOfPage() {
		Assert.assertTrue("Title is not display in Admin Page", titleOfPage.isDisplayed());
		
	}

	public void clickingToJobOption() {
		commonmethods.waitForElementToBeClickable(jobOption);
		jobOption.click();
		
	}

	public void verifyingAllOptions() {
		commonmethods.waitForElementToBeVisiable(jobOption);
		for  ( WebElement i : listOfJob) {
			System.out.println(i);
		}
		
	}

	
	// from dataTable validation
	public void verifyJobSubMenuItems(List<String> listOfItems) {
		for (int i =0; i<listOfJob.size(); i++) {
			String actualDatas = listOfJob.get(i).getText();
			String expetedDatas = listOfItems.get(i);
			Assert.assertTrue("Expected: "+ expetedDatas +" Actual: "+ actualDatas, actualDatas.equals(expetedDatas));
		}
		
	}

}
