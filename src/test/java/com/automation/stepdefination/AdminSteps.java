package com.automation.stepdefination;

import java.util.List;

import com.automation.page.AdminPage;
import com.automation.utils.DriverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps {

	AdminPage adminpage = new AdminPage(DriverUtils.getDriver());

	@Then("verify user on Adminpage")
	public void verify_user_on_adminpage() {
		adminpage.verifyTitleOfPage();
	}

	@When("user click to job option")
	public void user_click_to_job_option() {
		adminpage.clickingToJobOption();
	}

	@Then("verify all options showing in job menu")
	public void verify_all_options_showing_in_job_menu() {
		adminpage.verifyingAllOptions();

}
	@Then("verify Job sub menu items has following data")
		public void verify_job_sub_menu_items_has_following_data(DataTable dataTable) {
		    
			List<String> listOfItems = dataTable.asList();  // creating list of strings
			adminpage.verifyJobSubMenuItems(listOfItems);
		}



}
