package com.ict.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.PageUtils;

public class NewCourseButton {
	
	WebDriver driver;
	public NewCourseButton(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/adminpage/addcourses']")
	private WebElement addcourse;
	
	public void addCourse()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageUtils.ButtonClick(addcourse);
	}

}
