package com.automation.stepdefination;

import com.automation.page.ForgetPasswordPage;
import com.automation.page.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetPasswordStep {
	LoginPage loginPage = new LoginPage(DriverUtils.getDriver());
	ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage(DriverUtils.getDriver());
	
	
	@Then("verify user is on forget password page")
	public void verify_user_is_on_forget_password_page() {
		forgetPasswordPage.verifyForgetPasswordPage();
		
	}

	@When("user enter invalid username on forget password page")
	public void user_enter_invalid_username_on_forget_password_page() {
	    forgetPasswordPage.enterUserName("sdfsdf");;
	}

	

	@Then("verify invalid username error message is displayed on forget password page")
	public void verify_invalid_username_error_message_is_displayed_on_forget_password_page() {
	    forgetPasswordPage.verifyIncorrectUsernameMsg();
	}
	
	
	@When("click on reset password button")
	public void click_on_reset_password_button() {
		forgetPasswordPage.clickResetBtn();
		
	   
	}


}
