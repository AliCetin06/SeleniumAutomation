package com.automation.stepdefination;

import com.automation.page.AddUserPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps {
	
	AddUserPage addUserPage = new AddUserPage(DriverUtils.getDriver());
	
	@Then("verify user is on addUserPage")
	public void verify_user_is_on_user_details_page() {
		addUserPage.verifyTitleOfPage();
		
		
	}
	
	@When("user change to name of Admin to different name")
	public void user_change_to_name_of_admin_to_different_name() {
		addUserPage.fillRequiredUserDetails();
	}
	
	@When("user click to save button")
	public void user_click_to_save_button() {
	   addUserPage.clickOnSaveBtn();
	}
	
	

	

}
