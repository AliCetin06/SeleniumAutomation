package com.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.automation.utils.DriverUtils;

import java.util.List;

import org.junit.Assert;

public class CandidatesPage extends BasePage {
		@FindBy (xpath ="//a[text()='Candidates']")
		WebElement titleOfPage;
		
		@FindBy (xpath ="//div[text()='Account Assistant']")
		WebElement jobTitle;
		
		@FindBy (xpath ="//a[text()='Associate IT Manager']")
		WebElement vacancy;
		
		@FindBy (xpath ="//a[text()='Odis Adalwin']")
		WebElement hiringManager;
		
		@FindBy (xpath ="//a[text()='Application Initiated']")
		WebElement status;
		
		@FindBy (xpath ="//div[@class='oxd-autocomplete-wrapper']/div")
		WebElement candidateName;
		
		@FindBy (xpath ="(//div[@class='oxd-date-wrapper']/div)[1]")
		WebElement dateOfApplicationFrom;
		
		@FindBy (xpath ="(//div[@class='oxd-date-wrapper']/div)[2]]")
		WebElement dateOfApplicationTo;
		
		@FindBy (xpath ="//button[@type='submit']")
		WebElement searchBtn;
		
		@FindBy (xpath ="//span[text() ='No Records Found']")
		WebElement noRecordMsg;
		
		
		
		List<WebElement> dropdownList = driver.findElements(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
		
		
		
	

	public CandidatesPage(WebDriver driver) {
		super(driver);
	}

	
	
	
	
	@Override
	public void verifyTitleOfPage() {
		Assert.assertTrue("Title is not shown on page" , titleOfPage.isDisplayed());
		
	}
	
	public void selectJobtitle() {
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]")).click();
		action.moveToElement(jobTitle);
		jobTitle.click();
	}





	public void filloutPage() {
		selectJobtitle();
		
		/*
		for (WebElement i : dropdownList) {
			commonmethods.waitForElementToBeClickable(i);
			i.click();
		}
		
		jobTitle.click();
	vacancy.click();
		hiringManager.click();
		status.click();
		candidateName.click();
		dateOfApplicationFrom.click();
		dateOfApplicationTo.click();  
		
		*/
	}
	
	
	public void fillOutJobTitle() {
		
	}





	public void clickingSearchBtn() {
		searchBtn.click();
		
	}





	public void verifyNoRecord() {
		Assert.assertTrue("Error message is not displayed", noRecordMsg.isDisplayed());
		
	}

}
