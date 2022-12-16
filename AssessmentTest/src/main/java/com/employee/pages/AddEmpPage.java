package com.employee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.employee.Utilities.PageUtility;

public class AddEmpPage {
	
	
	WebDriver driver;
	
	
	@FindBy(id="ContentPlaceHolder1_txtName")
	private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
	private WebElement password;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	private WebElement email;
	
	@FindBy(id="ContentPlaceHolder1_drpDesignation")
	private WebElement designation;
	
	@FindBy(id="ContentPlaceHolder1_drpReportingTo")
	private WebElement reporting;
	
	@FindBy(id="ContentPlaceHolder1_drpGroup")
	private WebElement member;
	
	@FindBy(id="ContentPlaceHolder1_drpEmployeeType")
	private WebElement emptype;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
	private WebElement employeeid;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
	private WebElement confirmpwd;
	
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
	private WebElement mobileno;
	
	@FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
	private WebElement checkbox;
	
	@FindBy(id="ContentPlaceHolder1_txtAddress")
	private WebElement address;
	
	@FindBy(id="ContentPlaceHolder1_btnSubmit")
	private WebElement submitbtn;
	
	@FindBy(id="Reset")
	private WebElement resetbtn;
	
	
	public AddEmpPage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void setName(String strname) {
    	
    	PageUtility.sendInput(name, strname);
    }


	public void setPassword(String strpassword) {
	
		PageUtility.sendInput(password, strpassword);
	}	
	
	public void setEmail(String stremail) {
	
		PageUtility.sendInput(email, stremail);
	}
	
	public void setDesignation(String strdes) {
		
		PageUtility.sendInput(designation, strdes);
	}
	
	public void setReporting(String strrep) {
		
		PageUtility.sendInput(reporting, strrep);
	}
	
	public void setMember(String strmember) {
		
		PageUtility.sendInput(member, strmember);
	}
	
	
	public void setEmployeeid(String stremployeeid) {
		
		PageUtility.sendInput(employeeid, stremployeeid);
	}
	
	public void setConfirmpwd(String strconfirmpwd) {
		
		PageUtility.sendInput(confirmpwd, strconfirmpwd);
	}
	
	public void setMobileno(String strmobileno) {
		
		PageUtility.sendInput(mobileno, strmobileno);
	}
	
	public void setEmptype(String stremptype) {
		
		PageUtility.sendInput(emptype, stremptype);
	}
	
	public void selectCheckBox() {
    	
    	PageUtility.selectChkBox(checkbox);
    }
	
	
	public void setAddress(String straddress) {
		
		PageUtility.sendInput(address, straddress);
	}
	
	public void clickSubmit() {
        
		PageUtility.clickBtn(driver, submitbtn);
	        
	}
	
	public void clickReset() {
        
		PageUtility.reset(driver, resetbtn);
	        
	}
	
	
	
	
}
