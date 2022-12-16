package com.employee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.employee.Utilities.PageUtility;

public class EmployeeListPage {
	
	WebDriver driver;
	
	@FindBy(linkText="Employee")
	private WebElement empLink;
	
	@FindBy(linkText="List Employee")
	private WebElement listLink;
	
	@FindBy(linkText="Edit")
	private WebElement editbtn; 
	
	@FindBy(linkText="Delete")
	private WebElement deletebtn; 
	
	public EmployeeListPage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openEmployeeList()
	{
		
		PageUtility.hoverEvent(driver,empLink);
		PageUtility.clickBtn(driver, listLink);
	}
	
	public void clickEditbtn()
	{
		
		PageUtility.enterKeyEg(driver);
		PageUtility.clickBtn(driver, editbtn);
		
	}
	
	public void clickDeletebtn()
	{
		
		PageUtility.enterKeyEg(driver);
		PageUtility.clickBtn(driver, deletebtn);
		PageUtility.alertEg(driver);
	}
	

}
