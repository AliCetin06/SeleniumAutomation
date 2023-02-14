package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListingPage extends BasePage {
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'] )[2]")
	WebElement choosingAdmin;
	
	@FindBy(xpath = "//div[@class='oxd-topbar-header-title']")
	WebElement verifyingTitle;

	public UserListingPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnEditionBtn() {
		choosingAdmin.click();		
	}

	public void validateAddUserSucessMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyTitleOfPage() {
		Assert.assertTrue("Title is not in UserListingPage", verifyingTitle.isDisplayed());
		
	}

}
