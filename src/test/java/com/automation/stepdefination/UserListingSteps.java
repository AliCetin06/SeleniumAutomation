package com.automation.stepdefination;

import com.automation.page.UserListingPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserListingSteps {
	
	UserListingPage userListingPage =  new UserListingPage(DriverUtils.getDriver());
	
	
	
	
	@When("user click edit  in admin user on UserListingPage")
	public void user_click_edit_in_admin_user_on_user_listing_page() {
		userListingPage.verifyTitleOfPage();
	}
	
	@Then("verify to back on  UserListingPage")
	public void verify_to_back_on_user_listing_page() {
	    userListingPage.verifyTitleOfPage();
	}

}
