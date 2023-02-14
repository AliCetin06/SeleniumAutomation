package com.automation.stepdefination;

import com.automation.page.CandidatesPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandidatesStep {
	
	CandidatesPage candidates = new CandidatesPage(DriverUtils.getDriver());
	
	@Then("verify user in Candidates page")
	public void verify_user_in_candidates_page() {
		candidates.verifyTitleOfPage();
	}
	
	
	@When("user fillout the pages in Candidates page")
	public void user_fillout_the_pages() {
		candidates.filloutPage();
	    
	}
	
	@And("user click to search button in Candidates page")
	public void user_click_to_save_button_in_candidates_page() {
		candidates.clickingSearchBtn();
	   
	}
	
	@Then("verify showing no record found")
	public void verify_showing_no_record_found() {
		candidates.verifyNoRecord();
	   
	}


}
