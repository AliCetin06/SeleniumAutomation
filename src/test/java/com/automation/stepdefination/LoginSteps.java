package com.automation.stepdefination;

import org.openqa.selenium.WebDriver;

import com.automation.page.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage(DriverUtils.getDriver());

	@Given("user open website")
	public void user_open_website() {
		loginPage.openWebsite();
	}

	@Then("verify user is on login page")
	public void verify_user_is_on_login_page() {
		loginPage.verifyLoginOfPage();
	}

	@When("user login with invalid credintials")
	public void user_login_with_invalid_credintials() {
		loginPage.doLogin("sdfsdf", "dfdfgdf");
	}

	@Then("verify invalid login error message is displayed")
	public void verify_invalid_login_error_message_is_displayed() {
		loginPage.validateLoginErrorMsgInvalid();
	}
	
	@When("user login with blank credintials")
	public void user_login_with_blank_credintials() {
	    loginPage.doLogin("", "");
	}

	@Then("verify invalid login error message blank is displayed")
	public void verify_invalid_login_error_message_blank_is_displayed() {
	    loginPage.validateLoginErrorMsgBlank();
	}
	
	@When("user click on forget password link")
	public void user_click_on_forget_password_link() {
	    loginPage.clickingForgetPassword();
	}
	
	@When("user login with valid credentials")
	public void user_login_with_valid_credentials() {
		loginPage.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
	}
	
	
	// using dynamic data to decrese steps by valid credintial

		@When("user login with username {string} and password {string}")
		public void user_login_with_username_and_password(String usernameKey, String passwordKey) {
		   loginPage.doLogin(PropertyReader.getProperty(usernameKey), PropertyReader.getProperty(passwordKey));
		}
		
		
		// using dynamic data to decrese steps by invalid credintial
		@When("user login with invalid credintial username {string} and password {string}")
		public void user_login_with_invalid_credintial_username_and_password(String username, String password) {

			loginPage.doLogin(username, password);
		}





}
