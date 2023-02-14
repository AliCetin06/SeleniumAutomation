package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

import com.automation.utils.DriverUtils;

public class AddUserPage extends BasePage {
	
	@FindBy ( xpath= "//input[@placeholder='Type for hints...']")
	WebElement changeName;
	
	@FindBy ( xpath= "//button[@type='submit']")
	WebElement saveBtn;
	
	@FindBy ( xpath= "//div[@class='oxd-topbar-header']")
	WebElement titleOfPage;

	public AddUserPage(WebDriver driver) {
		super(driver);
	}

	
	public void clickOnSaveBtn() {
		commonmethods.waitForElementToBeClickable(saveBtn);
		saveBtn.click();
		
	}

	public  void fillRequiredUserDetails()  {
		commonmethods.waitForElementToBeClickable(changeName);
		changeName.clear();
		changeName.sendKeys("Radha  Borra");
	
	}


	@Override
	public void verifyTitleOfPage() {
		commonmethods.waitForElementToBeVisiable(titleOfPage);
		Assert.assertTrue("Page`s title is not displayed", titleOfPage.isDisplayed());
		
	}

}
