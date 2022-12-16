package com.employee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.employee.Utilities.PageUtility;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnSubmit")
	private WebElement loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	 public void setUsername(String strusername)
	 {
	        
    	 PageUtility.sendInput(username, strusername);
	
     }
    
    public void setPassword(String strpassword) {


        PageUtility.sendInput(password, strpassword);
	
    }
    
    
    public void clickLogin() {
        
		PageUtility.clickBtn(driver, loginbtn);
	        
	}
	

}
