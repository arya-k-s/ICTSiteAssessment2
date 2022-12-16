package com.ict.utilities;

import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageUtils {
	
	public static void ButtonClick(WebElement ele)
	{
		ele.click();
	}
	
	public static void sendInput(WebElement ele,String input)
	{
		
		ele.sendKeys(input);
	}
	
	 public static void OverElement(WebDriver driver,WebElement ele)
	    {
	    	Actions action=new Actions(driver);
	    	action.moveToElement(ele).build().perform();
	    }
	 
	
	 
	
	 
	 
	 
	

}
