package com.employee.Scripts;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.employee.base.Base;
import com.employee.pages.AddEmpPage;
import com.employee.pages.EmployeeListPage;
import com.employee.pages.HomePage;
import com.employee.pages.LoginPage;
import com.employee.Utilities.ExcelUtility;
import com.employee.constants.AutomationConstants;

public class TestClass extends Base{
	
	LoginPage objLogin;
	HomePage  objHome;
	AddEmpPage objAddEmp;
	EmployeeListPage objEmpList;
	
	@Test(priority=0)
	  public void ValidLoginVerification() throws Exception {
	      
			objLogin=new LoginPage(getDriver());
		
	      String actualusername=ExcelUtility.getCellData(0, 0).getStringCellValue();
	      objLogin.setUsername(actualusername);
	      Assert.assertEquals(AutomationConstants.expusername, actualusername);
	      
	      String actualpassword=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 1).getNumericCellValue());
	      objLogin.setPassword(actualpassword);
	      Assert.assertEquals(AutomationConstants.exppassword, actualpassword);
	      
	      objLogin.clickLogin();
	      String ActTitle=getDriver().getTitle();
	      Assert.assertEquals(AutomationConstants.ExpTitle, ActTitle);
	      System.out.println(ActTitle);
	      
	  }
	
	
	@Test(priority=1)
	public void ValidHomeVerification() throws Exception{
		
		objHome=new HomePage(getDriver());
		
		objHome.openAddEmployee();
		
	}
	
	@Test(priority=2)
	public void ValidAddEmpVerification() throws Exception{
		
		
		objAddEmp=new AddEmpPage(getDriver());
		
		String actualname=ExcelUtility.getCellData(1, 0).getStringCellValue();
	    objAddEmp.setName(actualname);
	    Assert.assertEquals(AutomationConstants.expname, actualname);
	    
	    String actualpwd=NumberToTextConverter.toText(ExcelUtility.getCellData(1, 1).getNumericCellValue());
	    objAddEmp.setPassword(actualpwd);
	    Assert.assertEquals(AutomationConstants.exppwd, actualpwd);
	    
	    String actualemail=ExcelUtility.getCellData(1, 2).getStringCellValue();
	    objAddEmp.setEmail(actualemail);
	    Assert.assertEquals(AutomationConstants.expemail, actualemail);
	    
	    String actualdes=ExcelUtility.getCellData(1, 3).getStringCellValue();
	    objAddEmp.setDesignation(actualdes);
	    Assert.assertEquals(AutomationConstants.expdesignation, actualdes);
	    
	    String actualrep=ExcelUtility.getCellData(1, 4).getStringCellValue();
	    objAddEmp.setReporting(actualrep);
	    Assert.assertEquals(AutomationConstants.expreporting, actualrep);
	    
	    String actualmember=ExcelUtility.getCellData(1, 5).getStringCellValue();
	    objAddEmp.setMember(actualmember);
	    Assert.assertEquals(AutomationConstants.expmember, actualmember);
	    
	    
	    String actualempid=NumberToTextConverter.toText(ExcelUtility.getCellData(1, 6).getNumericCellValue());
	    objAddEmp.setEmployeeid(actualempid);
	    Assert.assertEquals(AutomationConstants.expempid, actualempid);
	    
	    String actualconfirmpwd=NumberToTextConverter.toText(ExcelUtility.getCellData(1, 7).getNumericCellValue());
	    objAddEmp.setConfirmpwd(actualconfirmpwd);
	    Assert.assertEquals(AutomationConstants.expconfirmpwd, actualconfirmpwd);
	    
	    String actualmobileno=NumberToTextConverter.toText(ExcelUtility.getCellData(1, 8).getNumericCellValue());
	    objAddEmp.setMobileno(actualmobileno);
	    Assert.assertEquals(AutomationConstants.expmobileno, actualmobileno);
	    
	    String actualemptype=ExcelUtility.getCellData(1, 9).getStringCellValue();
	    objAddEmp.setEmptype(actualemptype);
	    Assert.assertEquals(AutomationConstants.expemptype, actualemptype);
	    
	    objAddEmp.selectCheckBox();
	    
	    String actualaddress=ExcelUtility.getCellData(1, 10).getStringCellValue();
	    objAddEmp.setAddress(actualaddress);
	    Assert.assertEquals(AutomationConstants.expaddress, actualaddress);
	    
	    objAddEmp.clickSubmit();
		
	}
	
	
	@Test(priority=3)
	public void ValidEmpListVerification() throws Exception{
		
		objEmpList=new EmployeeListPage(getDriver());
		
		objEmpList.openEmployeeList();
		
		objEmpList.clickEditbtn();
		
		objEmpList.openEmployeeList();
		
		objEmpList.clickDeletebtn();
	}

}
