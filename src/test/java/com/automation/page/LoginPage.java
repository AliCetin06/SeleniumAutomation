package com.automation.page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ReporterConfig.Property;

import com.automation.utils.PropertyReader;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//p[text() ='Forgot your password? ']")
	WebElement forgotPassword;
	// page factory
	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameInput;

	@FindBy(xpath = "//input[@name='password']")
	WebElement userPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clicking;

	@FindBy(xpath = "//span[text() ='Required']")
	List<WebElement> elements;

	@FindBy(xpath = "//p[text() ='Invalid credentials']")
	WebElement errorMessage;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void validateLoginErrorMsgInvalid() {
		System.out.println(errorMessage.isDisplayed());
		// displayed logo or not
	}

	public void validateLoginErrorMsgBlank() {

		if (elements.size() >= 1) {
			System.out.println(elements.size());
		}

	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("app.url"));

	}

	public void doLogin(String username, String password) {
		commonmethods.waitForElementToBeVisiable(userNameInput);
		userNameInput.sendKeys(username);
		userPassword.sendKeys(password);
		clicking.click();
	}

	public void clickingForgetPassword() {
		forgotPassword.click();

	}

	
	public void verifyLoginOfPage() {
		Assert.assertTrue("Login page is not displayed", userNameInput.isDisplayed());
		Assert.assertTrue("Login page is not displayed", userPassword.isDisplayed());
		
	}

	public void verifyLoginPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyTitleOfPage() {
		// TODO Auto-generated method stub
		
	}
}
