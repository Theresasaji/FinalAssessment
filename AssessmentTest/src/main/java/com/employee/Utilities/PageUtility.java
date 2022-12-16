package com.employee.Utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {
	
	public static void clickBtn(WebDriver driver,WebElement element)
	{
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
    
	public static void sendInput(WebElement element,String input)
    {
        element.sendKeys(input);
    }
	
	
	
	public static void reset(WebDriver driver, WebElement element)
    {
       
        element.clear();
    }
	
    public static void selectChkBox(WebElement ele) {
		
		if(!ele.isSelected())
		{
			ele.click();
		}
		
	}
    
    public static void hoverEvent(WebDriver driver, WebElement element)
    {
    	Actions action=new Actions(driver);
    	action.moveToElement(element).build().perform();
    }
    
    public static void enterKeyEg(WebDriver driver)
    {
    	
    	Actions action=new Actions(driver);
    	action.sendKeys(Keys.ARROW_DOWN);
    	action.sendKeys(Keys.ENTER);
    }
    
    public static void alertEg(WebDriver driver)
    {
    	Alert alert=driver.switchTo().alert();
    	alert.accept();
    }

}
