package com.automation.stepdefination;

import java.util.List;
import java.util.Map;

import com.automation.page.DataTableHomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableHomeSteps {
	
	DataTableHomePage datatablepage = new DataTableHomePage(DriverUtils.getDriver());

	
	
		@Given("user open the datatables website")
		public void user_open_the_datatables_website() {
			datatablepage.openDataTableWebsite();
		}


	

		@Then("verify user is on datatables homepage")
		public void verify_user_is_on_datatables_homepage() {
			datatablepage.verifyOfDataHomePage();
		}
		@Then("verify Table datas has following data")
		public void verify_table_datas_following_data(DataTable dataTable) {
			 List<List<String>> listOfItems = dataTable.asLists();  // creating list of list strings (2 dimentioal data) 
			 datatablepage.verifyDataTableData(listOfItems);
		}
		

			@Then("verify Table datas has following data with header")
			public void verify_table_datas_has_following_data_with_header(DataTable dataTable) {
				 List<Map<String, String>> listOfMap = dataTable.asMaps();// creating list of list strings (2 dimentioal data) 
				 datatablepage.verifyDataTableDataWithHeader(listOfMap);
			}






}
