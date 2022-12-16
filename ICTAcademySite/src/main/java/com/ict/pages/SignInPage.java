package com.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.PageUtils;

public class SignInPage {
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@data-bs-target='#exampleModalForm']")
	private WebElement loginClick;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	public void loginClick()
	{
		PageUtils.ButtonClick(loginClick);
		
	}
	
	public void EmailSend(String args)
	{
		PageUtils.sendInput(email, args);
	}
	
	public void PasswordSend(String args)
	{
		PageUtils.sendInput(password, args);
	}
	
	public void buttonClick()
	{
		PageUtils.ButtonClick(button);
	}
	
	

}
