package com.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.DriverUtils;

public class HomePage extends BasePage  {
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminBtn;
	
	@FindBy( xpath ="//span[text()='Recruitment']")
	WebElement RecruitmentBtn;
	
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void validateHomePage() {
		System.out.println(driver.findElement(By.cssSelector(".oxd-brand-banner img")).isDisplayed()); 
		// displayed logo or not
	}

	
	@Override
	public void verifyTitleOfPage() {
		// TODO Auto-generated method stub
		
	}

	public void clickingAdminBtn() {
		adminBtn.click();
		
	}

	public void clickingRecruitment() {
		RecruitmentBtn.click();
		
	}
	
	

}
