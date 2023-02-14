package com.automation.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage extends BasePage {

	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement resetButton;

	@FindBy(xpath = "//div[@class='orangehrm-card-container']")
	WebElement validation;

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);

	}

	public void clickResetBtn() {
		commonmethods.waitForElementToBeClickable(resetButton);
		resetButton.click();
	}

	public void validationResetPassword() {
		System.out.println(validation.isDisplayed());
		System.out.println(validation.getText());

	}

	@Override
	public void verifyTitleOfPage() {
		// TODO Auto-generated method stub

	}

	public void verifyIncorrectUsernameMsg() {
		// TODO Auto-generated method stub

	}

	public void verifyForgetPasswordPage() {
		Assert.assertTrue("Forget password page is not displayed", userName.isDisplayed());
		Assert.assertTrue("Forget password page is not displayed", resetButton.isDisplayed());

	}

}
