package com.employee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.employee.Utilities.PageUtility;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(linkText="Employee")
	private WebElement empLink;
	
	@FindBy(linkText="Add Employee")
	private WebElement addLink;
	
	@FindBy(linkText="List Employee")
	private WebElement listLink;
	
	
	public HomePage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void openAddEmployee()
	{
		
		PageUtility.hoverEvent(driver,empLink);
		PageUtility.clickBtn(driver, addLink);
	}
	

}
