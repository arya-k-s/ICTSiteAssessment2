package com.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.PageUtils;

public class RedirectNewCourse {
	
	WebDriver driver;
	public RedirectNewCourse(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@routerlink='/adminpage/courses']")
	private WebElement course;
	
	public void getCourse()
	{
		PageUtils.OverElement(driver, course);
		PageUtils.ButtonClick(course);
	}

}
