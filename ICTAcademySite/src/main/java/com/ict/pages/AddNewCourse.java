package com.ict.pages;

import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ict.utilities.PageUtils;

public class AddNewCourse {
	
WebDriver driver;
	
	public AddNewCourse(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@formcontrolname='title']")
	private WebElement coursetitle;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	private WebElement shortname;
	
	@FindBy(xpath="//input[@formcontrolname='type']")
	private WebElement type;
	
	@FindBy(xpath="(//div[@contenteditable='true'])[1]")
	private WebElement description;
	
	@FindBy(xpath="//Select[@formcontrolname='status']")
	private WebElement status;

	@FindBy(xpath="	//select[@formcontrolname='category']")
	private WebElement category;

			@FindBy(xpath="	(//div[@class='e-content e-lib e-keyboard'])[2]")
			private WebElement About;
			
			@FindBy(xpath="(//input[@name='date'])[2]")
			private WebElement entracedate;
			
			
			
			@FindBy(xpath="//input[@formcontrolname='fee']")
			private WebElement coursefee;
			
			@FindBy(xpath="//input[@formcontrolname='regfee']")
			private WebElement regfee;
			
			
	
	
	public void setCourseTitle(String args)
	{
		PageUtils.sendInput(coursetitle, args);
	}
	
	public void setShortName(String args)
	{
		PageUtils.sendInput(shortname, args);
	}
	public void setType(String args)
	{
		PageUtils.sendInput(type, args);
	}
	
	public void setDescription(String args)
	{
		PageUtils.sendInput(description, args);
	}
	
	public void setStatus()
	{
		Select select=new Select(status);
		select.selectByIndex(2);
	}
	
	public void setCategory()
	{
		Select select=new Select(category);
		select.selectByIndex(2);
	}
	
	public void setAbout(String args)
	{
		PageUtils.sendInput(About, args);
	}

//	public void setEntracedate()
//	{
//		Select select=new Select(entracedate);
//		select.selectByVisibleText("23/03/2023");
//	}
	
	public void setCourseFee(String args)
	{
		PageUtils.sendInput(coursefee, args);
	}
	
	public void setRegFee(String args)
	{
		PageUtils.sendInput(regfee, args);
	}

}
