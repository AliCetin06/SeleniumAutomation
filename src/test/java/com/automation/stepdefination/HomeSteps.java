package com.automation.stepdefination;


import com.automation.page.HomePage;
import com.automation.page.LoginPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage(DriverUtils.getDriver());
	
	
	
	@Then("verify user is navigated to home page")
	public void verify_user_is_navigated_to_homepage() {
		homePage.validateHomePage();
	}
	

	@When("user click to Admin tab")
	public void user_click_to_admin_tab() {
	    homePage.clickingAdminBtn();
	    }
	
	@When("user click to recruitment tab in Homepage")
	public void user_click_to_recruitment_tab_in_homepage() {
		homePage.clickingRecruitment();
	}
	





}
